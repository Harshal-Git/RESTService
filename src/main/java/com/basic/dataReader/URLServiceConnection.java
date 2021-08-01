/**
 * 
 */
package com.basic.dataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Harshal-Git
 *
 */
public class URLServiceConnection {

	private static String endPointURL = "https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users";

	private static URL urlObj = null;

	private static HttpURLConnection urlConnection = null;

	public static boolean isConnectionActive() {
		boolean aliveStatus = false;
		try {
			urlObj = new URL(endPointURL);
			urlConnection = (HttpURLConnection) urlObj.openConnection();
			urlConnection.setRequestMethod("GET");
			System.out.println("Connection status: "+urlConnection.getResponseCode());
			if(urlConnection.getResponseCode() == 200) {
				aliveStatus =  true;
				System.out.println("Connection is active.");
			} else {
				System.out.println("Connection is not active.");
			}
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL: "+e.getMessage());
		} catch (IOException e) {
			System.err.println("IO Exception: "+e.getMessage());
		} finally {
			urlConnection.disconnect();
		}
		//return aliveStatus;
		return false;
	}

	/**
	 * @return
	 */
	public static String getResponse() {
		// no connection : no response
		if(urlObj == null) {
			if(!isConnectionActive()) {
				return "";
			}
		}
		BufferedReader reader = null;
		StringBuilder response = new StringBuilder();
		String line = null;

		// put data from service into buffer
		try {
			urlConnection = (HttpURLConnection) urlObj.openConnection();
			urlConnection.setRequestMethod("GET");
			urlConnection.connect();
			reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			try {
				while((line = reader.readLine()) != null){
					response.append(line);
				}
			} catch (IOException e) {
				System.err.println("IO Exception: "+e.getMessage());
			}
		} catch (IOException e) {
			System.err.println("IO Exception: "+e.getMessage());
		} catch(IllegalAccessError er) {
			System.err.println("Illegal access to service."+er.getMessage());
		} finally {
			urlConnection.disconnect();
		}
		return response.toString();
	}
}
