package com.local.thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegX {

	public RegX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String input= "Hi This is string have clientID=23564 and clientID=47363884 and wrong clientNum=h454";
		Pattern p= Pattern.compile("(clientID=)(\\d+)");
		Matcher m= p.matcher(input);
		StringBuffer str=new StringBuffer();
		while(m.find()){
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			m.appendReplacement(str, m.group(1)+"***masked***");
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(str.toString());
		}
		//m.appendTail(str);
		System.out.println(str.toString());
	}

}
