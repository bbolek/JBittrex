package jbittrex.model;

import java.util.Arrays;

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
	@Override
	public String toString() {
		return "OrderBook [buy=" + Arrays.toString(buy) + ", sell=" + Arrays.toString(sell) + "]";
	}
}
