package jbittrex.model;

import java.util.Date;

public class MarketSummary {

	private String marketName;
	private double high;
	private double low;
	private double volume;
	private double last;
	private double baseVolume;
	private Date timeStamp;
	private double bid;
	private double ask;
	private int openBuyOrders;
	private int openSellOrders;
	private double prevDay;
	private Date created;
	private String displayMarketName;
	
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getLast() {
		return last;
	}
	public void setLast(double last) {
		this.last = last;
	}
	public double getBaseVolume() {
		return baseVolume;
	}
	public void setBaseVolume(double baseVolume) {
		this.baseVolume = baseVolume;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	public double getAsk() {
		return ask;
	}
	public void setAsk(double ask) {
		this.ask = ask;
	}
	public int getOpenBuyOrders() {
		return openBuyOrders;
	}
	public void setOpenBuyOrders(int openBuyOrders) {
		this.openBuyOrders = openBuyOrders;
	}
	public int getOpenSellOrders() {
		return openSellOrders;
	}
	public void setOpenSellOrders(int openSellOrders) {
		this.openSellOrders = openSellOrders;
	}
	public double getPrevDay() {
		return prevDay;
	}
	public void setPrevDay(double prevDay) {
		this.prevDay = prevDay;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getDisplayMarketName() {
		return displayMarketName;
	}
	public void setDisplayMarketName(String displayMarketName) {
		this.displayMarketName = displayMarketName;
	}
}
