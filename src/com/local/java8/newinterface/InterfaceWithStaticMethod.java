package com.local.java8.newinterface;

public interface InterfaceWithStaticMethod {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
	default void log(String str) {
		System.out.println("I34 logging::" + str);
	}
	void method2();
}
