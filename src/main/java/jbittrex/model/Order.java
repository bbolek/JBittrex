package jbittrex.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Order {
	
	@SerializedName("OrderUuid")
	private String orderUuid;	
	@SerializedName("Exchange")
	private String exchange;
	@SerializedName("Limit")
	private double limit;
	@SerializedName("Quantity")
	private double quantity;
	@SerializedName("QuantityRemaining")
	private double quantityRemaining;
	@SerializedName("Reserved")
	private double reserved;
	@SerializedName("ReserveRemaining")
	private double reserveRemaining;
	@SerializedName("CommissionReserved")
	private double commissionReserved;
	@SerializedName("CommissionReserveRemaining")
	private double commissionReserveRemaining;
	@SerializedName("CommissionPaid")
	private double commissionPaid;
	@SerializedName("Price")
	private double price;
	@SerializedName("PricePerUnit")
	private double pricePerUnit;
	@SerializedName("Opened")
	private Date opened;
	@SerializedName("Closed")
	private Date closed;
	@SerializedName("IsOpen")
	private boolean isOpen;
	@SerializedName("Sentinel")
	private String sentinel;
	@SerializedName("CancelInitiated")
	private boolean cancelInitiated;
	@SerializedName("IsConditional")
	private boolean isConditional;
	@SerializedName("Condition")
	private String condition;
	@SerializedName("ConditionTarget")
	private String conditionTarget;
	@SerializedName("OrderType")
	private String orderType;
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
	public double getReserved() {
		return reserved;
	}
	public void setReserved(double reserved) {
		this.reserved = reserved;
	}
	public double getReserveRemaining() {
		return reserveRemaining;
	}
	public void setReserveRemaining(double reserveRemaining) {
		this.reserveRemaining = reserveRemaining;
	}
	public double getCommissionReserved() {
		return commissionReserved;
	}
	public void setCommissionReserved(double commissionReserved) {
		this.commissionReserved = commissionReserved;
	}
	public double getCommissionReserveRemaining() {
		return commissionReserveRemaining;
	}
	public void setCommissionReserveRemaining(double commissionReserveRemaining) {
		this.commissionReserveRemaining = commissionReserveRemaining;
	}
	public double getCommissionPaid() {
		return commissionPaid;
	}
	public void setCommissionPaid(double commissionPaid) {
		this.commissionPaid = commissionPaid;
	}
	public Date getOpened() {
		return opened;
	}
	public void setOpened(Date opened) {
		this.opened = opened;
	}
	public Date getClosed() {
		return closed;
	}
	public void setClosed(Date closed) {
		this.closed = closed;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public String getSentinel() {
		return sentinel;
	}
	public void setSentinel(String sentinel) {
		this.sentinel = sentinel;
	}
	public boolean isCancelInitiated() {
		return cancelInitiated;
	}
	public void setCancelInitiated(boolean cancelInitiated) {
		this.cancelInitiated = cancelInitiated;
	}
	@Override
	public String toString() {
		return "Order [orderUuid=" + orderUuid + ", exchange=" + exchange + ", limit=" + limit + ", quantity="
				+ quantity + ", quantityRemaining=" + quantityRemaining + ", reserved=" + reserved
				+ ", reserveRemaining=" + reserveRemaining + ", commissionReserved=" + commissionReserved
				+ ", commissionReserveRemaining=" + commissionReserveRemaining + ", commissionPaid=" + commissionPaid
				+ ", price=" + price + ", pricePerUnit=" + pricePerUnit + ", opened=" + opened + ", closed=" + closed
				+ ", isOpen=" + isOpen + ", sentinel=" + sentinel + ", cancelInitiated=" + cancelInitiated
				+ ", isConditional=" + isConditional + ", condition=" + condition + ", conditionTarget="
				+ conditionTarget + ", orderType=" + orderType + ", immediateOrCancel=" + immediateOrCancel + "]";
	}
}
