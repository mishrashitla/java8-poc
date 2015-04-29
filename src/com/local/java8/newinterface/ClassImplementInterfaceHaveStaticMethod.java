package com.local.java8.newinterface;

public class ClassImplementInterfaceHaveStaticMethod implements
		InterfaceWithStaticMethod {
	public static boolean isNull(String str) {
        System.out.println("Impl Null Check");
 
        return str == null ? true : false;
    }
     
    public static void main(String args[]){
    	ClassImplementInterfaceHaveStaticMethod obj = new ClassImplementInterfaceHaveStaticMethod();
        obj.print("");
        obj.isNull("abc");
    }
}
