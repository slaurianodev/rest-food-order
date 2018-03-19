package br.com.slauriano.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.tomcat.util.codec.binary.Base64;

import br.com.slauriano.model.Customer;
import br.com.slauriano.repo.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(value = "/api/v1/Customer/auth", method = RequestMethod.POST, produces = "application/json")
	public Customer getByLogin(
			@RequestParam(value = "email", required = true, defaultValue = "0") String email,
			@RequestParam(value = "password", required = true, defaultValue = "0") String password) {
		return customerRepository.findByEmailAndPassword(email,password);
	}
	
	@RequestMapping(value = "/api/v1/Customer", method = RequestMethod.POST, consumes = "application/json")
	public String createCustomer(@RequestBody Customer customer) {

		Date getDate = new Date();

		customer.setCreation(getDate);

		customerRepository.save(customer);

		String login = customer.getEmail()+":"+customer.getPassword();

		byte[] b = login.getBytes();
		
		Base64.encodeBase64(b);
		
		return new String(Base64.encodeBase64(b));
	}

}
