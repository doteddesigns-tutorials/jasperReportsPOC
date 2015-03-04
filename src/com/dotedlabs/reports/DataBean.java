package com.dotedlabs.reports;

/**
 * The model object that is used to populate the 
 * report
 * 
 * @author Sandeep K Nair
 *
 */
public class DataBean {
	private String name;
	private String occupation;
	private String place;
	private String country;
	
	public DataBean(){}
	
	/**
	 * @param name
	 * @param occupation
	 * @param place
	 * @param country
	 */
	public DataBean(String name, String occupation, String place, String country) {
		super();
		this.name = name;
		this.occupation = occupation;
		this.place = place;
		this.country = country;
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
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
