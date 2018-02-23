package com.formation.tools;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	String date;
	
	
	public void Dateutil()
	{
		date = null;
	}
	
	
	public  String returnDatelocale(Date d)
	{
		SimpleDateFormat formater = new SimpleDateFormat( "dd/MM/yyyy H:mm:ss" ); 
		return formater.format(d); 
	}

	public String getDate()
	{
		return returnDatelocale(new Date());
	}

	
}
