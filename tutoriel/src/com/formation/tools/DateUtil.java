package com.formation.tools;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(returnDatelocale(d));
		
	}
	
	public static String returnDatelocale(Date d)
	{
		SimpleDateFormat formater = new SimpleDateFormat( "dd/MM/yyyy H:mm:ss" ); 
		return formater.format(d); 
	}

}
