package jbittrex.model;

public class Currency {

	private String currency;
	private String currencyLong;
	private int minConfirmation;
	private double txFee;
	private boolean isActive;
	private String coinType;
	private String baseAddress;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrencyLong() {
		return currencyLong;
	}
	public void setCurrencyLong(String currencyLong) {
		this.currencyLong = currencyLong;
	}
	public int getMinConfirmation() {
		return minConfirmation;
	}
	public void setMinConfirmation(int minConfirmation) {
		this.minConfirmation = minConfirmation;
	}
	public double getTxFee() {
		return txFee;
	}
	public void setTxFee(double txFee) {
		this.txFee = txFee;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getCoinType() {
		return coinType;
	}
	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}
	public String getBaseAddress() {
		return baseAddress;
	}
	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}
}
