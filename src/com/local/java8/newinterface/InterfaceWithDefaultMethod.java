package com.local.java8.newinterface;

public interface InterfaceWithDefaultMethod {

	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}

}
