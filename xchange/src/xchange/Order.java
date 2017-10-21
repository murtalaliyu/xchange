package xchange;

import java.util.*;

public class Order {

	//information about order
	int id;
	String trader;
	Date date;
	double amount;
	char buyOrSell;
	
	//constructor
	public Order(int id, String trader, Date date, double amount, char buyOrSell) {
		this.id = id;
		this.trader = trader;
		this.date = date;
		this.amount = amount;
		this.buyOrSell = buyOrSell;
	}
	
	//setters and getters
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setTrader(String trader) {
		this.trader = trader;
	}
	
	public String getTrader() {
		return trader;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setBuyOrSell(char buyOrSell) {
		this.buyOrSell = buyOrSell;
	}
	
	public char getBuyOrSell() {
		return buyOrSell;
	}
}
