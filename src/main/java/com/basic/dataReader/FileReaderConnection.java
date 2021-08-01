/**
 * 
 */
package com.basic.dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Harshal-Git
 *
 */
public class FileReaderConnection {

	private static String fileName = "data.json";

	/**
	 * @return
	 */
	public static String getResponse() {
		BufferedReader reader = null;
		StringBuilder response = new StringBuilder();
		String line = null;
		
		// put data from file into buffer
		try {
			reader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.err.println("File not found exception: "+e.getMessage());
		}
		
		// read data from buffer
		try {
			while((line = reader.readLine()) != null){
				response.append(line);
			}
		} catch (IOException e) {
			System.err.println("IO Exception: "+e.getMessage());
		}
		return response.toString();
	}
}
