package com.local.java8.newinterface;

public class ClassImplementInterfaceHaveDefaultMethod implements
		InterfaceWithDefaultMethod, InterfaceWithStaticMethod {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String s) {
		System.out.println("Good Evening!");
		InterfaceWithDefaultMethod.super.log(s);
	}

}
