package com.local.collection;

import java.util.ArrayList;

class A {
}

class B extends A {
}

class C extends B {
}

public class ThreadDemo
{
	public static void main(String args[]) {
		ArrayList<A> x = new ArrayList<A>();
		ArrayList a = new ArrayList();
		x.add(new A());
		a = x;
		a.add(new B());
		ArrayList b = a;
		ArrayList<C> c = (ArrayList<C>) b;
		c.add(new C());
		a.add(new A());
		for (Object obj : c)
			System.out.println(obj);

	}

}