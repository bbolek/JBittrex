package jbittrex.model;

import java.util.Date;

public class HistoryRecord {

	private String paymentUuid;
	private String currency;
	private String address;
	private Date opened;
	private boolean authorized;
	private boolean pendingPayment;
	private double txCost;
	private String txId;
	private boolean canceled;
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
}
