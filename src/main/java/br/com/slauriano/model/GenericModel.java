package br.com.slauriano.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface GenericModel {

	public default String formatDate(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return dateFormat.format(date);
	}
	
}
