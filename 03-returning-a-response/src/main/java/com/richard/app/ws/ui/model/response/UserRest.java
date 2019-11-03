/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 03-returning-a-response
 * Create Date: Nov 3, 2019
 */
package com.richard.app.ws.ui.model.response;

/**
 * @author richard
 *
 */
public class UserRest {
	private String firstName;
	private String lastName;
	private String email;
	private int userId;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}	
}
