package com.sample.scartpro.practicecorejava;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
//we can use wild card <?> or <T>
public class SampleGenerics {

	public static void main(String[] args) {
		List<Integer> listIntegers = new LinkedList<>();
		listIntegers.add(1);
		listIntegers.add(2);
		testGenerics(listIntegers);

		
		List<Integer> nums = listIntegers.stream().map(n-> n/2).collect(Collectors.toList());
		System.out.println(nums);
		
		
		List<String> listStrings = new LinkedList<>();
		listStrings.add("orange");
		listStrings.add("apple");
		listStrings.add("banana");
		testGenerics(listStrings);
	}

	public static <T> void testGenerics(List<T> items) {
		System.out.println(items);
		
	}
}
