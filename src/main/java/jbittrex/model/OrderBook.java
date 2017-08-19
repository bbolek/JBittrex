package jbittrex.model;

public class OrderBook {

	OrderBookItem[] buy;
	OrderBookItem[] sell;
	
	public OrderBookItem[] getBuy() {
		return buy;
	}
	public void setBuy(OrderBookItem[] buy) {
		this.buy = buy;
	}
	public OrderBookItem[] getSell() {
		return sell;
	}
	public void setSell(OrderBookItem[] sell) {
		this.sell = sell;
	}
}
