package com.java.hash.set;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> set= new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		for( int nums: set) {
			System.out.print(nums+ " ");
		}
		set.add(50);
		System.out.println(set);
		
		set.remove(50);
		System.out.println(set);
	}

}
