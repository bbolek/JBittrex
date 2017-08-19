package jbittrex.model;

import com.google.gson.annotations.SerializedName;

public class OrderBookItem {

	@SerializedName("Quantity")
	private double quantity;
	@SerializedName("Rate")
	private double rate;
	
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
