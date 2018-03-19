package br.com.slauriano.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.slauriano.dto.OrderDTO;
import br.com.slauriano.dto.OrderItemDTO;
import br.com.slauriano.model.Customer;
import br.com.slauriano.model.OrderCustomer;
import br.com.slauriano.model.OrderItem;
import br.com.slauriano.repo.CustomerRepository;
import br.com.slauriano.repo.OrderItemRepository;
import br.com.slauriano.repo.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(value = "/api/v1/Order", method = RequestMethod.POST, produces = "application/json")
	public OrderDTO createOrder(@RequestHeader(value = "Authorization") String auth, @RequestBody OrderDTO orderDTO) {
		Date now = new Date();

		if (validateLogin(auth)) {

			System.out.println(orderDTO);

			OrderCustomer order = new OrderCustomer(now, orderDTO.getCustomerId(), orderDTO.getDeliveryAddress(),
					orderDTO.getContact(), orderDTO.getStoreId(), orderDTO.getTotal(), orderDTO.getStatus(), now);

			orderRepository.save(order);

			orderDTO.setDate(order.getDate());
			orderDTO.setLasteUpdate(order.getLastUpdate());

			saveOrderItems(orderDTO.getOrderItems(), order);

			orderDTO.getOrderItems().forEach(item -> item.setOrderId(order.getId()));

			return orderDTO;
		}
		
		return null;

	}

	private void saveOrderItems(List<OrderItemDTO> orderItems, OrderCustomer order) {
		orderItems.forEach(item -> orderItemRepository.save(convertToOrderItem(item, order)));
	}

	private OrderItem convertToOrderItem(OrderItemDTO orderItemDTO, OrderCustomer order) {
		return new OrderItem(order.getId(), orderItemDTO.getProductId(), orderItemDTO.getPrice(),
				orderItemDTO.getQuantity(), orderItemDTO.getTotal());
	}

	private OrderItemDTO convertToOrderItemDTO(OrderItem orderItem) {
		return new OrderItemDTO(orderItem.getOrderId(), orderItem.getProductId(), orderItem.getPrice(),
				orderItem.getQuantity(), orderItem.getTotal());
	}

	public boolean validateLogin(String login) {
		boolean result = true;

		String base64key = login.replace("Basic", "").trim();

		try {
			byte[] decodedKey = Base64.decodeBase64(base64key);

			String[] emailAndPass = new String(decodedKey).split(":");

			Customer customer = customerRepository.findByEmailAndPassword(emailAndPass[0], emailAndPass[1]);
			if (customer == null) {
				result = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/api/v1/Order/{orderId}", method = RequestMethod.GET)
	public OrderDTO getOrderById(@PathVariable("orderId") final Long orderId) {
		OrderCustomer order = orderRepository.findOne(orderId);

		OrderDTO orderDTO = new OrderDTO(order.getCustomerId(), order.getDeliveryAddress(), order.getContact(),
				order.getStoreId(), order.getTotal(), order.getStatus(), order.getDate(), order.getLastUpdate());

		List<OrderItem> orderItems = orderItemRepository.findByOrderId(order.getId());

		List<OrderItemDTO> listOrderItemDTO = new ArrayList<>();

		orderItems.forEach(item -> listOrderItemDTO.add(convertToOrderItemDTO(item)));

		orderDTO.setOrdemItems(listOrderItemDTO);

		return orderDTO;
	}
}
