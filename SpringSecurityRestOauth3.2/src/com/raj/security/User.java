package com.raj.security;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
	
	private static final long serialVersionUID = 6149731191830356420L;
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private String[] roles;
	private String value;	// Authentication Token
	private String sessionId;

	public User() {
		super();
	}

	public User(String name, String email, String password, String[] roles) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public User(String name, String password, String[] roles) {
		super();
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	
	public User(String name, String password, String phone) {
		super();
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	
	/**
	 * login works as ID here, if there is normal ID column, use that of course
	 * equals/hashCode is very important for AuthenticationServiceImpl#tokens to
	 * work properly
	 */
	@Override
	public boolean equals(Object o) {
		return this == o || o != null && o instanceof User && Objects.equals(name, ((User) o).name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
