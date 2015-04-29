package com.local.string;

import java.util.stream.IntStream;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "shitla";
		String string2 = "shitlaMishra";
		String string3 = "shitl";
		System.out.println(string1.compareTo(string2));
		System.out.println(string1.compareTo(string3));
		System.out.println(string2.compareTo(string3));
		System.out.println(string2.compareTo(string2));
		System.out.println("----------------------------------------");
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
		System.out.println(string2.equals(string3));

		//Runnable r1 = () -> System.out.println("My Runnable");
		CompareString obj =new CompareString();
		
		try {
			obj.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//r1.run();
	/*	try {
			r1.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r1.notify();
		r1.run();*/
		System.out.println(CompareString.isPrime(4));

	}

	private static boolean isPrime(int number) {        
	    return number > 1
	            && IntStream.range(2, number).noneMatch(
	                    index -> number % index == 0);
	}
	
	
}
