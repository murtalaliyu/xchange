package xchange;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Main program runs here, testing also occurs here
		
		Date dateTime = new Date();
		Order order = new Order(1,"Sec01","Murt",dateTime,100,'B');
		
		System.out.println("id: " + order.id);
		System.out.println("security: " + order.security);
		System.out.println("trader name: " + order.trader);
		System.out.println("date and time: " + order.dateTime);
		System.out.println("amount: " + order.amount);
		System.out.println("buy or sell? " + order.buyOrSell);
	}
}
