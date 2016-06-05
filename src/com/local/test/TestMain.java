package com.local.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class TestMain {

	public TestMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Map<String,String> env=System.getenv();		
		Properties env=System.getProperties();
		System.out.println();
		for(Entry<Object, Object> envVar:env.entrySet()){
			System.out.println(envVar.getKey()+" = "+envVar.getValue());
		}	

	}

}
