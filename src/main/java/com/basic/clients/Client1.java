/**
 * 
 */
package com.basic.clients;

import java.util.Arrays;

import com.basic.queryProcessor.QueryProcessor;

/**
 * @author Harshal-Git
 *
 *	-> Process the queries on JSON data without constructing internal objects. 
 */
public class Client1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		QueryProcessor qp = new QueryProcessor();
		String [] queryArr = new String[3];

		// EQUALS case 1
		queryArr[0] = "username";
		queryArr[1] = "EQUALS";
		queryArr[2] = "vinay";
		System.out.println("Query: "+Arrays.toString(queryArr)+" => Result: "+qp.searchQuery(queryArr).toString());

		// EQUALS case 2
		queryArr[0] = "address.city";
		queryArr[1] = "EQUALS";
		queryArr[2] = "Bengaluru";
		System.out.println("Query: "+Arrays.toString(queryArr)+" => Result: "+qp.searchQuery(queryArr).toString());

		// EQUALS case 3
		queryArr[0] = "company.name";
		queryArr[1] = "EQUALS";
		queryArr[2] = "hola";
		System.out.println("Query: "+Arrays.toString(queryArr)+" => Result: "+qp.searchQuery(queryArr).toString());

		// EQUALS case 4
		queryArr[0] = "username";
		queryArr[1] = "EQUALS";
		queryArr[2] = "hola";
		System.out.println("Query: "+Arrays.toString(queryArr)+" => Result: "+qp.searchQuery(queryArr).toString());
		
		// IN case 5
		queryArr[0] = "address.city";
		queryArr[1] = "IN";
		queryArr[2] = "Mumbai,Bengaluru";
		System.out.println("Query: "+Arrays.toString(queryArr)+" => Result: "+qp.searchQuery(queryArr).toString());
	}
}
