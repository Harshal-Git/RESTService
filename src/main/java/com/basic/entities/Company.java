/**
 * 
 */
package com.basic.entities;

/**
 * @author Harshal-Git
 *
 */
public class Company {

	private String name;
	
	private String basename;

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
	 * @return the basename
	 */
	public String getBasename() {
		return basename;
	}

	/**
	 * @param basename the basename to set
	 */
	public void setBasename(String basename) {
		this.basename = basename;
	}

	@Override
	public String toString() {
		return "Company [" + (name != null ? "name=" + name + ", " : "")
				+ (basename != null ? "basename=" + basename : "") + "]";
	}
	
}
