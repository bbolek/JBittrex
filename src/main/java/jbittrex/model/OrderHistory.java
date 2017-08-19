package jbittrex.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class OrderHistory {

	@SerializedName("OrderUuid")
	private String orderUuid;
	@SerializedName("Exchange")
	private String exchange;
	@SerializedName("TimeStamp")
	private Date timeStamp;
	@SerializedName("OrderType")
	private String orderType;
	@SerializedName("Limit")
	private double limit;
	@SerializedName("Quantity")
	private double quantity;
	@SerializedName("QuantityRemaining")
	private double quantityRemaining;
	@SerializedName("Commission")
	private double commission;
	@SerializedName("Price")
	private double price;
	@SerializedName("PricePerUnit")
	private double pricePerUnit;
	@SerializedName("IsConditional")
	private boolean isConditional;
	@SerializedName("Condition")
	private String condition;
	@SerializedName("ConditionTarget")
	private String conditionTarget;
	@SerializedName("ImmediateOrCancel")
	private boolean immediateOrCancel;	
	public String getOrderUuid() {
		return orderUuid;
	}
	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getQuantityRemaining() {
		return quantityRemaining;
	}
	public void setQuantityRemaining(double quantityRemaining) {
		this.quantityRemaining = quantityRemaining;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public boolean isConditional() {
		return isConditional;
	}
	public void setConditional(boolean isConditional) {
		this.isConditional = isConditional;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getConditionTarget() {
		return conditionTarget;
	}
	public void setConditionTarget(String conditionTarget) {
		this.conditionTarget = conditionTarget;
	}
	public boolean isImmediateOrCancel() {
		return immediateOrCancel;
	}
	public void setImmediateOrCancel(boolean immediateOrCancel) {
		this.immediateOrCancel = immediateOrCancel;
	}
	@Override
	public String toString() {
		return "OrderHistory [orderUuid=" + orderUuid + ", exchange=" + exchange + ", timeStamp=" + timeStamp
				+ ", orderType=" + orderType + ", limit=" + limit + ", quantity=" + quantity + ", quantityRemaining="
				+ quantityRemaining + ", commission=" + commission + ", price=" + price + ", pricePerUnit="
				+ pricePerUnit + ", isConditional=" + isConditional + ", condition=" + condition + ", conditionTarget="
				+ conditionTarget + ", immediateOrCancel=" + immediateOrCancel + "]";
	}
}
