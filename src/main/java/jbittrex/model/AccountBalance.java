package jbittrex.model;

import com.google.gson.annotations.SerializedName;

public class AccountBalance {

	@SerializedName("Currency")
	private String currency;
	@SerializedName("Balance")
	private double balance;
	@SerializedName("Available")
	private double available;
	@SerializedName("Pending")
	private double pending;
	@SerializedName("CryptoAddress")
	private String cryptoAddress;
	@SerializedName("Requested")
	private double requested;
	@SerializedName("Uuid")
	private String uuid;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAvailable() {
		return available;
	}
	public void setAvailable(double available) {
		this.available = available;
	}
	public double getPending() {
		return pending;
	}
	public void setPending(double pending) {
		this.pending = pending;
	}
	public String getCryptoAddress() {
		return cryptoAddress;
	}
	public void setCryptoAddress(String cryptoAddress) {
		this.cryptoAddress = cryptoAddress;
	}
	public double getRequested() {
		return requested;
	}
	public void setRequested(double requested) {
		this.requested = requested;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	@Override
	public String toString() {
		return "AccountBalance [currency=" + currency + ", balance=" + balance + ", available=" + available
				+ ", pending=" + pending + ", cryptoAddress=" + cryptoAddress + ", requested=" + requested + ", uuid="
				+ uuid + "]";
	}
}
