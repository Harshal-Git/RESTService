/**
 * 
 */
package com.basic.entities;

/**
 * @author Harshal-Git
 *
 */
public class Address {
	
	private String street;
	
	private String suite;
	
	private String city;
	
	private String zipcode;
	
	private GeoLocation geo;

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the suite
	 */
	public String getSuite() {
		return suite;
	}

	/**
	 * @param suite the suite to set
	 */
	public void setSuite(String suite) {
		this.suite = suite;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the geo
	 */
	public GeoLocation getGeo() {
		return geo;
	}

	/**
	 * @param geo the geo to set
	 */
	public void setGeo(GeoLocation geo) {
		this.geo = geo;
	}

	@Override
	public String toString() {
		return "Address [" + (street != null ? "street=" + street + ", " : "")
				+ (suite != null ? "suite=" + suite + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (zipcode != null ? "zipcode=" + zipcode + ", " : "") + (geo != null ? "geo=" + geo : "") + "]";
	}
	
}
