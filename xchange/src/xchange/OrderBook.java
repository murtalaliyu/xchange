package xchange;

import java.util.*;

public class OrderBook {

	//a hash map with security type as key and its order book as value
	//value should represent an array of buy or sell orders (each should contain its specific order book)
	//might need to change value input
	public Map<String,Order[]> securityOrders = new HashMap<String,Order[]>();
	
	public ArrayList<Order> buyOrders = new ArrayList<Order>();
	public ArrayList<Order> sellOrders = new ArrayList<Order>();
	
	//add buy order
	public synchronized Map<String,Order[]> addBuyOrder(Map<String,Order[]> securityOrders) {
		
		securityOrders = this.securityOrders;
		//code goes here
		return securityOrders;
	}
	
	//add sell order
	public synchronized Map<String,Order[]> addSellOrder(Map<String,Order[]> securityOrders) {
		
		securityOrders = this.securityOrders;
		//code goes here
		return securityOrders;
	}
	
	//edit buy order
	public synchronized Map<String,Order[]> editBuyOrder(Map<String,Order[]> securityOrders) {
		
		securityOrders = this.securityOrders;
		//code goes here
		return securityOrders;
	}
	
	//edit sell order
	public synchronized Map<String,Order[]> editSellOrder(Map<String,Order[]> securityOrders) {
		
		securityOrders = this.securityOrders;
		//code goes here
		return securityOrders;
	}
	
	//cancel buy order
	public synchronized Map<String,Order[]> cancelBuyOrder(Map<String,Order[]> securityOrders) {
		
		securityOrders = this.securityOrders;
		//code goes here
		return securityOrders;
	}
	
	//cancel sell order
	public synchronized Map<String,Order[]> cancelSellOrder(Map<String,Order[]> securityOrders) {
		
		securityOrders = this.securityOrders;
		//code goes here
		return securityOrders;
	}
}
