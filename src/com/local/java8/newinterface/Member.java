package com.local.java8.newinterface;

import java.util.List;

public class Member {
	private String name;
	private String lastName;
	private String memberType;
	private List<String> roles;
	private String sso;
	private String email;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSso() {
		return sso;
	}

	public void setSso(String sso) {
		this.sso = sso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Member(String name, String memberType, List<String> roles) {
		super();
		this.name = name;
		this.memberType = memberType;
		this.roles = roles;
	}

	public Member(String name, String lastName, String memberType,
			List<String> roles, String sso, String email) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.memberType = memberType;
		this.roles = roles;
		this.sso = sso;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	 public void printEasternName(){
	      
		    System.out.println("\nName: " + this.getName());
		  }

}
