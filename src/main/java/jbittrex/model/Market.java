package jbittrex.model;

import java.util.Date;

public class Market {

	private String marketCurrency;
	private String baseCurrency;
	private String marketCurrencyLong;
	private String baseCurrencyLong;
	private double minTradeSize;
	private boolean isActive;
	private Date created;
	
	public String getMarketCurrency() {
		return marketCurrency;
	}
	public void setMarketCurrency(String marketCurrency) {
		this.marketCurrency = marketCurrency;
	}
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getMarketCurrencyLong() {
		return marketCurrencyLong;
	}
	public void setMarketCurrencyLong(String marketCurrencyLong) {
		this.marketCurrencyLong = marketCurrencyLong;
	}
	public String getBaseCurrencyLong() {
		return baseCurrencyLong;
	}
	public void setBaseCurrencyLong(String baseCurrencyLong) {
		this.baseCurrencyLong = baseCurrencyLong;
	}
	public double getMinTradeSize() {
		return minTradeSize;
	}
	public void setMinTradeSize(double minTradeSize) {
		this.minTradeSize = minTradeSize;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
}
