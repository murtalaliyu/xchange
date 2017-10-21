package xchange;

import java.util.*;

public class Order {

	//information about order
	long id;
	String security;
	String trader;
	Date dateTime;
	double amount;
	char buyOrSell;
	
	//constructor
	public Order(long id, String security, String trader, Date dateTime, double amount, char buyOrSell) {
		this.id = id;
		this.security = security;
		this.trader = trader;
		this.dateTime = dateTime;
		this.amount = amount;
		this.buyOrSell = buyOrSell;
	}
	
	//setters and getters
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setSecurity(String security) {
		this.security = security;
	}
	
	public String getSecurity() {
		return security;
	}
	
	public void setTrader(String trader) {
		this.trader = trader;
	}
	
	public String getTrader() {
		return trader;
	}
	
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	public Date getDateTime() {
		return dateTime;
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
