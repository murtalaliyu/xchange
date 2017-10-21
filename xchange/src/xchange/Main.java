package xchange;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Main program runs here, testing also occurs here
		Date date = new Date();
		Order order = new Order(1,"Murt",date,100,'B');
		
		System.out.println("ID: " + order.getId());
		order.setId(2);
		System.out.println("New ID: " + order.getId());
	}
}
