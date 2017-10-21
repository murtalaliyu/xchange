package xchange;

import java.util.*;

public class OrderBook {

	//a hash map with security type as key and its order book as value
	//value should represent an array of buy or sell orders (each should contain its specific order book)
	//might need to change value input
	public Map<String,ArrayList<Order>> securityOrders = new HashMap<String,ArrayList<Order>>();
	
	public ArrayList<Order> buyOrders = new ArrayList<Order>();
	public ArrayList<Order> sellOrders = new ArrayList<Order>();
	
	//add buy order
	
	//add sell order
	
	//edit buy order
	
	//edit sell order
	
	//cancel buy order
	
	//cancel sell order
}
