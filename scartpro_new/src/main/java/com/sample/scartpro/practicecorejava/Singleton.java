package com.sample.scartpro.practicecorejava;

import java.util.List;

public class Singleton {
	
	private static final Singleton INSTANCE = new Singleton();			
	
	private Singleton() {
		
	}

	public static Singleton	getInstance() {
		return INSTANCE;
	}
	

	public static void main(String [] args) {
		
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
//		LocalDateTime noneww = LocalDateTime.parse("2017-11-25T22:30");
//		System.out.println(noneww);
		
//		Set<String> sample = new HashSet<>();
		
		List<String> names = List.of("Larry", "Kenny", "Sabrina");
		for (int i = 0; i < names.size(); i += 2) {
		    System.out.println(names.get(i));
		}
		
	}
}
