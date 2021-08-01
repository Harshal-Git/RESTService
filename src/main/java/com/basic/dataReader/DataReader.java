/**
 * 
 */
package com.basic.dataReader;

/**
 * @author Harshal-Git
 *
 */
public class DataReader {

	public static String getJsonData() {
		// first check whether URL client is active OR not?
		if(URLServiceConnection.isConnectionActive()) {
			System.out.println("Data reading from service.");
			return URLServiceConnection.getResponse();
		} 
		// if still response is empty
		else {
			// if not; read data from file added into class path
			System.out.println("Data reading from file.");
			return FileReaderConnection.getResponse();
		}
	}
}
