/**
 * 
 */
package com.basic.clients;

import com.basic.dataReader.DataReader;
import com.basic.entities.User;
import com.google.gson.Gson;

/**
 * @author Harshal-Git
 *
 *	-> Create internal objects to get structured data. (Not for query processing)
 */
public class Client2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gson gson = new Gson();
		User[] userData = gson.fromJson(DataReader.getJsonData(), User[].class);
		System.out.println("User data size: "+userData.length);
		System.out.println("User data => ");
		for(User usr : userData) {
			System.out.println(usr.toString());
		}
	}
}
