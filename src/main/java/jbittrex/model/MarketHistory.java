package jbittrex.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class MarketHistory {

	@SerializedName("Id")
	public long id;
	@SerializedName("TimeStamp")
	public Date timeStamp;
	@SerializedName("Quantity")
	public double quantity;
	@SerializedName("Price")
	public double price;
	@SerializedName("Total")
	public double total;
	@SerializedName("FillType")
	public String fillType;
	@SerializedName("OrderType")
	public String orderType;	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFillType() {
		return fillType;
	}
	public void setFillType(String fillType) {
		this.fillType = fillType;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	@Override
	public String toString() {
		return "MarketHistory [id=" + id + ", timeStamp=" + timeStamp + ", quantity=" + quantity + ", price=" + price
				+ ", total=" + total + ", fillType=" + fillType + ", orderType=" + orderType + "]";
	}
}
