/**
 * 
 */
package com.basic.queryProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.basic.dataReader.DataReader;
import com.google.gson.Gson;

/**
 * @author Harshal-Git
 *
 *	-> Processing map of strings & objects directly to process given queries
 */
public class QueryProcessor {

	private List<Map<String, Object>> mapList = null; 

	/**
	 * constructor 
	 */
	@SuppressWarnings("unchecked")
	public QueryProcessor() {
		Gson gson = new Gson();
		mapList =  gson.fromJson(DataReader.getJsonData(), List.class);
	}

	public void printJsonResponse() {
		String jsonResponse = DataReader.getJsonData();
		System.out.println(jsonResponse);
	}

	public List<Integer> searchQuery(String[] queryArr) {

		List<Integer> idArr = new ArrayList<>();

		String property = queryArr[0];
		String operation = queryArr[1];
		String value = queryArr[2];

		// single query function
		if(operation.equals("EQUALS")) {
			if(!property.contains(".")) {
				// single property result
				return searchData(property, value);
			} else {
				// nested property result
				String [] properties = property.split("\\.");
				return searchData(properties, value);
			}
		}
		// multi query function
		if(operation.equals("IN")) {
			if(!property.contains(".")) {
				// single level multi value search
				String [] values = value.split(",");
				return searchData(property, values);
			} else {
				// nested level multi value search
				String [] properties = property.split("\\.");
				String [] values = value.split(",");
				return searchData(properties, values);
			}
		}
		return idArr;
	}

	/**
	 * @param properties
	 * @param values
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<Integer> searchData(String[] properties, String[] values) {
		List<Integer> arr = new ArrayList<>();
		Map<String, Object> innerObj = null;
		boolean resultFound = false;
		for(Map<String, Object> outerObj : mapList) {
			innerObj = (Map<String, Object>) outerObj.get(properties[0]);
			if(innerObj.get(properties[1]).toString().toLowerCase().contains(values[0].toLowerCase()) || 
					innerObj.get(properties[1]).toString().toLowerCase().contains(values[1].toLowerCase())) {
				resultFound = true;
				arr.add(Double.valueOf(outerObj.get("id").toString()).intValue());
			}
		}
		// if no results found
		if(!resultFound) {
			arr.add(-1);
		}
		return arr;
	}

	/**
	 * @param property
	 * @param values
	 * @return
	 */
	private List<Integer> searchData(String property, String[] values) {
		List<Integer> arr = new ArrayList<>();
		boolean resultFound = false;
		for(Map<String, Object> mapObj : mapList) {
			if(mapObj.get(property).toString().toLowerCase().contains(values[0].toLowerCase()) || 
					mapObj.get(property).toString().toLowerCase().contains(values[1].toLowerCase())) {
				resultFound = true;
				arr.add(Double.valueOf(mapObj.get("id").toString()).intValue());
			}
		}
		// if no results found
		if(!resultFound) {
			arr.add(-1);
		}
		return arr;
	}

	/**
	 * @param properties
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<Integer> searchData(String[] properties, String value) {
		List<Integer> arr = new ArrayList<>();
		Map<String, Object> innerObj = null;
		boolean resultFound = false;
		for(Map<String, Object> outerObj : mapList) {
			innerObj = (Map<String, Object>) outerObj.get(properties[0]);
			if(innerObj.get(properties[1]).toString().toLowerCase().contains(value.toLowerCase())) {
				resultFound = true;
				arr.add(Double.valueOf(outerObj.get("id").toString()).intValue());
			}
		}
		// if no results found
		if(!resultFound) {
			arr.add(-1);
		}
		return arr;
	}

	/**
	 * @param string
	 * @param value
	 * @return
	 */
	private List<Integer> searchData(String property, String value) {
		List<Integer> arr = new ArrayList<>();
		boolean resultFound = false;
		for(Map<String, Object> mapObj : mapList) {
			if(mapObj.get(property).toString().toLowerCase().contains(value.toLowerCase())) {
				resultFound = true;
				arr.add(Double.valueOf(mapObj.get("id").toString()).intValue());
			}
		}
		// if no results found
		if(!resultFound) {
			arr.add(-1);
		}
		return arr;
	}
}
