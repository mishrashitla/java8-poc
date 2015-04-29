package com.local.collection.access1;

class DefaultClass {
	public String publicVariable = "publicVar";
	private String privateVaribale = "privateVar";
	protected String protectedVaribale = "protectedVar";
	String defaultVarible = "defaultVar";

	public void publicMethod() {
		System.out.println("public method");
	}

	private void privateMethod() {
		System.out.println("privateMethod method");
	}

	void defaultMethod() {
		System.out.println("defaultMethod method");
	}
	protected void protectedMethod() {
		System.out.println("protectedMethod method");
	}

}
