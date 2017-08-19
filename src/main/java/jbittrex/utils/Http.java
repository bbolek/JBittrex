package jbittrex.utils;

import static jbittrex.utils.Constants.API_URL;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.HttpRequest;

public class Http {
	/**
	 * HTTP Fetch Method, Fetches Given Url without parameters
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static String fetch (String url) throws Exception {
		return fetch(url, null);
	}
	
	/**
	 * HTTP Fetch Method, Fetches Given Url with Parameters
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static String fetch (String url, HashMap<String, Object> queryParams) throws Exception {
		HttpRequest request = Unirest.get(API_URL + url);
		if (queryParams != null) {
			request = request.queryString(queryParams);
		}
		
		HttpResponse<String> httpResult = request.asString(); 
		if (httpResult.getStatus() == 200) {
			return httpResult.getBody();
		} else {
			throw new Exception("Server Error : " + httpResult.getStatus() + " : " + httpResult.getStatusText());
		}
	}
	
	
	/**
	 * HTTP Fetch Method With Sign, Fetches Given Url with Parameters
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static String fetch(String url, HashMap<String, Object> queryParams, String apiSecret) throws Exception {
		long nonce = new Date().getTime();
		String finalUrl = API_URL + url+"?";
		for (Entry<String, Object> param : queryParams.entrySet()) {
			finalUrl = finalUrl + param.getKey() + "=" + param.getValue() + "&";
		}
		finalUrl = finalUrl + "nonce="+nonce;
		HttpRequest request = Unirest.get(finalUrl);
		String sign = sign(apiSecret, finalUrl);
		HttpResponse<String> httpResult = request.header("apisign", sign).asString(); 
		if (httpResult.getStatus() == 200) {
			return httpResult.getBody();
		} else {
			throw new Exception("Server Error : " + httpResult.getStatus() + " : " + httpResult.getStatusText());
		}
	}
	
	public static String sign(String key, String message) {
		Mac sha512_HMAC = null;
		 try{
		        byte [] byteKey = key.getBytes("UTF-8");
		        final String HMAC_SHA256 = "HmacSHA512";
		        sha512_HMAC = Mac.getInstance(HMAC_SHA256);      
		        SecretKeySpec keySpec = new SecretKeySpec(byteKey, HMAC_SHA256);
		        sha512_HMAC.init(keySpec);
		        byte [] mac_data = sha512_HMAC.
		         doFinal(message.getBytes("UTF-8"));
		        //result = Base64.encode(mac_data);
		        String result = bytesToHex(mac_data);
		        return result;
		    } catch (UnsupportedEncodingException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    } catch (NoSuchAlgorithmException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    } catch (InvalidKeyException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }finally{
		    }
		return null;
	}
	
	public static String bytesToHex(byte[] bytes) {
	    final  char[] hexArray = "0123456789ABCDEF".toCharArray();
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
}
