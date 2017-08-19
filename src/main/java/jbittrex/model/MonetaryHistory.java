package jbittrex.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class MonetaryHistory {

	@SerializedName("PaymentUuid")
	private String paymentUuid;
	@SerializedName("Currency")
	private String currency;
	@SerializedName("Address")
	private String address;
	@SerializedName("Opened")
	private Date opened;
	@SerializedName("Authorized")
	private boolean authorized;
	@SerializedName("PendingPayment")
	private boolean pendingPayment;
	@SerializedName("TxCost")
	private double txCost;
	@SerializedName("TxId")
	private String txId;
	@SerializedName("Canceled")
	private boolean canceled;
	@SerializedName("InvalidAddress")
	private boolean invalidAddress;
	
	public String getPaymentUuid() {
		return paymentUuid;
	}
	public void setPaymentUuid(String paymentUuid) {
		this.paymentUuid = paymentUuid;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getOpened() {
		return opened;
	}
	public void setOpened(Date opened) {
		this.opened = opened;
	}
	public boolean isAuthorized() {
		return authorized;
	}
	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}
	public boolean isPendingPayment() {
		return pendingPayment;
	}
	public void setPendingPayment(boolean pendingPayment) {
		this.pendingPayment = pendingPayment;
	}
	public double getTxCost() {
		return txCost;
	}
	public void setTxCost(double txCost) {
		this.txCost = txCost;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public boolean isCanceled() {
		return canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
	public boolean isInvalidAddress() {
		return invalidAddress;
	}
	public void setInvalidAddress(boolean invalidAddress) {
		this.invalidAddress = invalidAddress;
	}
	@Override
	public String toString() {
		return "MonetaryHistory [paymentUuid=" + paymentUuid + ", currency=" + currency + ", address=" + address
				+ ", opened=" + opened + ", authorized=" + authorized + ", pendingPayment=" + pendingPayment
				+ ", txCost=" + txCost + ", txId=" + txId + ", canceled=" + canceled + ", invalidAddress="
				+ invalidAddress + "]";
	}
}
