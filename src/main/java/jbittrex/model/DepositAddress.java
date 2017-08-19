package jbittrex.model;

import com.google.gson.annotations.SerializedName;

public class DepositAddress {

	@SerializedName("Currency")
	private String currency;
	@SerializedName("Address")
	private String address;
	
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
	@Override
	public String toString() {
		return "DepositAddress [currency=" + currency + ", address=" + address + "]";
	}
}
