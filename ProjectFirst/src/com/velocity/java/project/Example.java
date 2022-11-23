package com.velocity.java.project;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("seema");
		name.add("sweety");
		name.add("Amrita");
		name.add("seema");
		for(String s:name) {
			System.out.println(s);
		}

	}

}
