package jbittrex.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Market {
	@SerializedName("MarketCurrency")
	private String marketCurrency;
    @SerializedName("BaseCurrency")
	private String baseCurrency;
    @SerializedName("MarketCurrencyLong")
	private String marketCurrencyLong;
    @SerializedName("BaseCurrencyLong")
	private String baseCurrencyLong;
	@SerializedName("MinTradeSize")
	private double minTradeSize;
	@SerializedName("IsActive")
	private boolean isActive;
	@SerializedName("Created")
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
	@Override
	public String toString() {
		return "Market [marketCurrency=" + marketCurrency + ", baseCurrency=" + baseCurrency + ", marketCurrencyLong="
				+ marketCurrencyLong + ", baseCurrencyLong=" + baseCurrencyLong + ", minTradeSize=" + minTradeSize
				+ ", isActive=" + isActive + ", created=" + created + "]";
	}
	
}
