/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.domain;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class UserDetailsEntity extends TableServiceEntity {

	public UserDetailsEntity(String partitionKey, String rowKey) { // NO_UCD
																	// (unused
																	// code)
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;// globalid
	}

	/**
	 * Instantiates a new po entity.
	 */
	public UserDetailsEntity() {
	}

	private String userName;

	private String email;

	private String role;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDetailsEntity [userName=" + userName + ", email=" + email + ", role=" + role + "]";
	}

}
