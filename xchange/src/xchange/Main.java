/*
 * Author: Murtala Aliyu
 */

package xchange;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Main program runs here, testing also occurs here
		
		/*Date dateTime = new Date();
		Order order = new Order(1,"Stock","Sec01","Murt Aliyu",dateTime,100,'B');
		
		System.out.println("id: " + order.getId());
		System.out.println("instrument: " + order.getInstrument());
		System.out.println("security: " + order.getSecurity());
		System.out.println("trader name: " + order.getTrader());
		System.out.println("date and time: " + order.getDateTime());
		System.out.println("amount: " + order.getAmount());
		System.out.println("buy or sell? " + order.getBuyOrSell());
		
		order.setAmount(243);
		System.out.println("New amount: " + order.getAmount());*/
		
		System.out.println("-------------------------------------------------------");
		
		XchangeServer.runXchangeServer();
		XchangeClient.runXchangeClient();
	}
}
