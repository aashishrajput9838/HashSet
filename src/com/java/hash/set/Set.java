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
		
		System.out.print("ORIGNAL SET is: ");
		for( int nums: set) {
			System.out.print(nums+ " ");
		}
		System.out.println();
		
		set.add(50);
		System.out.println("SET AFTER INSERTING 50 is: "+ set);
		
		set.remove(50);
		System.out.println("SET AFTER REMOVING 50 is: "+ set);
	}

}
