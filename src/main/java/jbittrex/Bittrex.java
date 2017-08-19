package jbittrex;

import java.util.Date;
import java.util.HashMap;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import jbittrex.model.APIResponse;
import jbittrex.model.AccountBalance;
import jbittrex.model.Currency;
import jbittrex.model.DepositAddress;
import jbittrex.model.Market;
import jbittrex.model.MarketHistory;
import jbittrex.model.MarketSummary;
import jbittrex.model.MonetaryHistory;
import jbittrex.model.Order;
import jbittrex.model.OrderBook;
import jbittrex.model.OrderHistory;
import jbittrex.model.Id;
import jbittrex.model.Ticker;
import jbittrex.utils.DateDeserializer;
import jbittrex.utils.Http;

public class Bittrex {

	private static Logger log = LogManager.getLogger(Bittrex.class);
	private String apiKey;
	private String apiSecret;


	public Bittrex(String apiKey, String apiSecret) {
		System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
		this.apiKey = apiKey;
		this.apiSecret = apiSecret;
	}
	
	
	/********* MARKET API **********/
		
	/**
	 * Creates Buy Limit Order
	 * @param marketName :  Market Name (ex: BTC-BCC)
	 * @param quantity : Amount to purchase
	 * @param rate : Rate at which to place order
	 * @return : OrderId (uuid)
	 * @throws Exception
	 */
	public Id buyLimit(String marketName, double quantity, double rate) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			params.put("market", marketName);
			params.put("quantity", quantity);
			params.put("rate", rate);
			String resultBody = Http.fetch("/market/buylimit", params, this.apiSecret);
			APIResponse<Id> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Id>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/**
	 *  Creates Sell Limit Order
	 * @param marketName :  Market Name (ex: BTC-BCC)
	 * @param quantity : Amount to sell
	 * @param rate : Rate at which to place order
	 * @return : OrderId (uuid)
	 * @throws Exception
	 */
	public Id sellLimit(String marketName, double quantity, double rate) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			params.put("market", marketName);
			params.put("quantity", quantity);
			params.put("rate", rate);
			String resultBody = Http.fetch("/market/selllimit", params, this.apiSecret);
			APIResponse<Id> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Id>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/**
	 * Cancels Order
	 * @param orderId OrderId which to be cancelled
	 * @return
	 * @throws Exception
	 */
	public Id cancelOrder(String orderId) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			params.put("uuid", orderId);
			String resultBody = Http.fetch("/market/cancel", params, this.apiSecret);
			APIResponse<Id> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Id>>() {});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/**
	 * Gets Users Open Orders; Needs Authorization...
	 * @return
	 * @throws Exception
	 */
	public Order[] getOpenOrders() throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			String resultBody = Http.fetch("/market/getopenorders", params, this.apiSecret);
			APIResponse<Order[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Order[]>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/********* END OF MARKET API **********/
	
	/********* ACCOUNT API **********/
	
	/**
	 * Gets accounts all balances
	 * @return array of existing balances
	 * @throws Exception
	 */
	public AccountBalance[] getBalances() throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			String resultBody = Http.fetch("/account/getbalances", params, this.apiSecret);
			APIResponse<AccountBalance[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<AccountBalance[]>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/**
	 * Gets specific balance
	 * @param currency : Currency of requested balance
	 * @return Balance Info
	 * @throws Exception
	 */
	public AccountBalance getBalance(String currency) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			params.put("currency", currency);
			String resultBody = Http.fetch("/account/getbalance", params, this.apiSecret);
			APIResponse<AccountBalance> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<AccountBalance>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/**
	 * Gets Deposit Address of Currency
	 * @param currency : Deposit address currency
	 * @return Address Info
	 * @throws Exception
	 */
	public DepositAddress getDepositAddress(String currency) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			params.put("currency", currency);
			String resultBody = Http.fetch("/account/getdepositaddress", params, this.apiSecret);
			APIResponse<DepositAddress> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<DepositAddress>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	
	
	public Id withdraw(String currency, double quantity, String address, String paymentId) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			if (currency == null || currency.equals("")) {
				throw new Exception("Address cannot be empty!");
			}
			if (quantity == 0 || quantity < 0) {
				throw new Exception("Quantity must be positive!");	
			}
			if (address == null || address.equals("")) {
				throw new Exception("Address cannot be empty!");
			}
			params.put("apiKey", this.apiKey);
			params.put("currency", currency);
			params.put("quantity", currency);
			params.put("address", currency);
			paymentId = paymentId == null ? "" : paymentId;
			params.put("paymentid", paymentId);
			String resultBody = Http.fetch("/account/withdraw", params, this.apiSecret);
			APIResponse<Id> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Id>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Error", e);
			throw e;
		}
	}
	
	public Order getOrder(String uuid) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			params.put("uuid", uuid);
			String resultBody = Http.fetch("/account/getorder", params, this.apiSecret);
			APIResponse<Order> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Order>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	public OrderHistory[] getOrderHistory(String marketName) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			if (marketName != null && !marketName.equals("")) {
				params.put("marketName", marketName);
			}
			String resultBody = Http.fetch("/account/getorderhistory", params, this.apiSecret);
			APIResponse<OrderHistory[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<OrderHistory[]>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	
	public MonetaryHistory[] getWithdrawalHistory(String currency) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			if (currency != null && !currency.equals("")) {
				params.put("marketName", currency);
			}
			String resultBody = Http.fetch("/account/getwithdrawalhistory", params, this.apiSecret);
			APIResponse<MonetaryHistory[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<MonetaryHistory[]>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	
	public MonetaryHistory[] getDepositHistory(String currency) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			if (currency != null && !currency.equals("")) {
				params.put("marketName", currency);
			}
			String resultBody = Http.fetch("/account/getwithdrawalhistory", params, this.apiSecret);
			APIResponse<MonetaryHistory[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<MonetaryHistory[]>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}
	
	/********* END OF ACCOUNT API **********/

	

	/********* PUBLIC API **********/

	/**
	 * Gets Market Info, Does not need authorization
	 * 
	 * @returns Market Info as Array.
	 * @throws Exception
	 */
	public Market[] getMarkets() throws Exception {
		try {
			String resultBody = Http.fetch("/public/getmarkets");
			APIResponse<Market[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Market[]>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/**
	 * Gets Market Summaries, Does not need authorization
	 * 
	 * @returns Market Info as Array.
	 * @throws Exception
	 */
	public MarketSummary[] getMarketSummaries() throws Exception {
		try {
			String resultBody = Http.fetch("/public/getmarketsummaries");
			APIResponse<MarketSummary[]> parsedResponse = parseResponse(resultBody,
					new TypeToken<APIResponse<MarketSummary[]>>() {
					});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/**
	 * 
	 * @param marketName
	 *            : Market Name (ex. BTC-LTC), Does not need authorization
	 * @return Summary of the Market
	 * @throws Exception
	 */
	public MarketSummary getMarketSummary(String marketName) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
			String resultBody = Http.fetch("/public/getmarketsummary", params);
			APIResponse<MarketSummary[]> parsedResponse = parseResponse(resultBody,
					new TypeToken<APIResponse<MarketSummary[]>>() {
					});
			if (parsedResponse.isSuccess()) {
				if (parsedResponse.result.length > 0) {
					return parsedResponse.result[0];
				}
				throw new Exception("Invalid Market : " + marketName);
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/**
	 * 
	 * @param marketName required string for the market (ex: BTC-LTC)
	 * @return Market's History
	 * @throws Exception
	 */
	public MarketHistory[] getMarketHistory(String marketName) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
			String resultBody = Http.fetch("/public/getmarkethistory", params);
			APIResponse<MarketHistory[]> parsedResponse = parseResponse(resultBody,
					new TypeToken<APIResponse<MarketHistory[]>>() {
					});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/**
	 * 
	 * @param marketName
	 *            required string for the market (ex: BTC-LTC)
	 * @param type
	 *            required buy, sell or both to identify the type of orderbook to
	 *            return
	 * @return Order Book
	 * @throws Exception
	 */
	public OrderBook getOrderBook(String marketName, String type) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
			params.put("type", type);
			String resultBody = Http.fetch("/public/getorderbook", params);
			APIResponse<OrderBook> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<OrderBook>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/**
	 * Gets Currency Info, Does not need authorization
	 * 
	 * @returns Currency Info as Array.
	 * @throws Exception
	 */
	public Currency[] getCurrencies() throws Exception {
		try {
			String resultBody = Http.fetch("/public/getcurrencies");
			APIResponse<Currency[]> parsedResponse = parseResponse(resultBody,
					new TypeToken<APIResponse<Currency[]>>() {
					});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/**
	 * 
	 * @param marketName
	 *            : Market Name (ex. BTC-LTC), Does not need authorization
	 * @return Current Ticker
	 * @throws Exception
	 */
	public Ticker getTicker(String marketName) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
			String resultBody = Http.fetch("/public/getticker", params);
			APIResponse<Ticker> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Ticker>>() {
			});
			if (parsedResponse.isSuccess()) {
				return parsedResponse.result;
			} else {
				throw new Exception("Server Response : " + parsedResponse.getMessage());
			}
		} catch (Exception e) {
			log.error("Parse Error", e);
			throw e;
		}
	}

	/********* END OF PUBLIC API **********/
	/**
	 * Parses the given String,
	 * 
	 * @param json
	 *            String to be parsed
	 * @param type
	 *            Object Type
	 * @return Returns Deserialized Object
	 */
	private static <T> APIResponse<T> parseResponse(String json, TypeToken<?> type) {
		return new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create().fromJson(json,
				type.getType());
	}

}
