package jbittrex.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class MarketSummary {

	@SerializedName("MarketName")
	private String marketName;
	@SerializedName("High")
	private double high;
	@SerializedName("Low")
	private double low;
	@SerializedName("Volume")
	private double volume;
	@SerializedName("Last")
	private double last;
	@SerializedName("BaseVolume")
	private double baseVolume;
	@SerializedName("TimeStamp")
	private Date timeStamp;
	@SerializedName("Bid")
	private double bid;
	@SerializedName("Ask")
	private double ask;
	@SerializedName("OpenBuyOrders")
	private int openBuyOrders;
	@SerializedName("OpenSellOrders")
	private int openSellOrders;
	@SerializedName("PrevDay")
	private double prevDay;
	@SerializedName("Created")
	private Date created;
	@SerializedName("DisplayMarketName")
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
