package xchange;

import java.util.*;

public class Order {

	//information about order
	private long id;
	private String security;
	private String trader;
	private Date dateTime;
	private double amount;
	private char buyOrSell;
	
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
	void setId(long id) {
		this.id = id;
	}
	
	long getId() {
		return id;
	}
	
	void setSecurity(String security) {
		this.security = security;
	}
	
	String getSecurity() {
		return security;
	}
	
	void setTrader(String trader) {
		this.trader = trader;
	}
	
	String getTrader() {
		return trader;
	}
	
	void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	Date getDateTime() {
		return dateTime;
	}
	
	void setAmount(double amount) {
		this.amount = amount;
	}
	
	double getAmount() {
		return amount;
	}
	
	void setBuyOrSell(char buyOrSell) {
		this.buyOrSell = buyOrSell;
	}
	
	char getBuyOrSell() {
		return buyOrSell;
	}
}
