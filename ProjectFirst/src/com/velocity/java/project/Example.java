package com.velocity.java.project;
//Print duplicate element from arraylist
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("seema");
		name.add("sweety");
		name.add("Amrita");
		name.add("seema");
		name.add("Amrita");
		Set<String> set=new HashSet<>();
		
		for(String s:name) {
			if (set.add(s)==false)  //my second commit on github
			System.out.println(s);
		}

	}

}
