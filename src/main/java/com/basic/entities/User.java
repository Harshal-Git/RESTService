/**
 * 
 */
package com.basic.entities;

/**
 * @author Harshal-Git
 *
 */
public class User {

	private int id;
	
	private String name;
	
	private String username;
	
	private String email;
	
	private Address address;
	
	private String website;
	
	private Company company;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (address != null ? "address=" + address + ", " : "")
				+ (website != null ? "website=" + website + ", " : "") + (company != null ? "company=" + company : "")
				+ "]\n";
	}
	
}
