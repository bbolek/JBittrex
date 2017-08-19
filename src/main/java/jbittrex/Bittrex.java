package jbittrex;

import java.util.Date;
import java.util.HashMap;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import jbittrex.model.APIResponse;
import jbittrex.model.Currency;
import jbittrex.model.Market;
import jbittrex.model.MarketHistory;
import jbittrex.model.MarketSummary;
import jbittrex.model.Order;
import jbittrex.model.OrderBook;
import jbittrex.model.Ticker;
import jbittrex.utils.DateDeserializer;
import jbittrex.utils.Http;
public class Bittrex {

	private static Logger log = LogManager.getLogger(Bittrex.class);
	private String apiKey;
	private String apiSecret;
	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
		try {
			Bittrex bittrex = new Bittrex("apiKey", "apiSecret");
			MarketHistory[] result = bittrex.getMarketHistory("btc-bcc");
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Bittrex (String apiKey, String apiSecret) {
		this.apiKey = apiKey;
		this.apiSecret = apiSecret;
	}

	public Order[] getOpenOrders() throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("apiKey", this.apiKey);
			String resultBody = Http.fetch("/market/getopenorders", params, this.apiSecret);	
			APIResponse<Order[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Order[]>>() {});
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
	
	
	
	/*********PUBLIC API**********/
	
	/**
	 * Gets Market Info, Does not need authorization
	 * @returns Market Info as Array. 
	 * @throws Exception
	 */
	public Market[] getMarkets() throws Exception {
		try {
			String resultBody = Http.fetch("/public/getmarkets");	
			APIResponse<Market[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Market[]>>() {});
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
	 * @returns Market Info as Array. 
	 * @throws Exception
	 */
	public MarketSummary[] getMarketSummaries() throws Exception {
		try {
			String resultBody = Http.fetch("/public/getmarketsummaries");	
			APIResponse<MarketSummary[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<MarketSummary[]>>() {});
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
	 * @param marketName : Market Name (ex. BTC-LTC), Does not need authorization
	 * @return Summary of the Market
	 * @throws Exception
	 */
	public MarketSummary getMarketSummary(String marketName) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
			String resultBody = Http.fetch("/public/getmarketsummary", params);	
			APIResponse<MarketSummary[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<MarketSummary[]>>() {});
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
			APIResponse<MarketHistory[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<MarketHistory[]>>() {});
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
	 * @param marketName required string for the market (ex: BTC-LTC)
	 * @param type required	buy, sell or both to identify the type of orderbook to return
	 * @return Order Book
	 * @throws Exception
	 */
	public OrderBook getOrderBook(String marketName, String type) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
			params.put("type", type);
			String resultBody = Http.fetch("/public/getorderbook", params);	
			APIResponse<OrderBook> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<OrderBook>>() {});
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
	 * @returns Currency Info as Array. 
	 * @throws Exception
	 */
	public Currency[] getCurrencies() throws Exception {
		try {
			String resultBody = Http.fetch("/public/getcurrencies");	
			APIResponse<Currency[]> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Currency[]>>() {});
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
	 * @param marketName : Market Name (ex. BTC-LTC), Does not need authorization
	 * @return Current Ticker
	 * @throws Exception
	 */
	public Ticker getTicker(String marketName) throws Exception {
		try {
			HashMap<String, Object> params = new HashMap<>();
			params.put("market", marketName.toUpperCase());
 			String resultBody = Http.fetch("/public/getticker", params);	
			APIResponse<Ticker> parsedResponse = parseResponse(resultBody, new TypeToken<APIResponse<Ticker>>() {});
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
	
	/*********END OF PUBLIC API**********/
	/**
	 * Parses the given String, 
	 * @param json String to be parsed
	 * @param type Object Type
	 * @return Returns Deserialized Object
	 */
	private static <T> APIResponse<T> parseResponse(String json, TypeToken<?> type) {
	    return new GsonBuilder().registerTypeAdapter(Date.class, new DateDeserializer()).create().fromJson(json, type.getType());
	}

}
