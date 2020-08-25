package com.vijay.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.Consumer;
public class StreamsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(11);
		
		Stream s1 = intList.stream();
		Predicate<Integer> p= i ->( i%2!=0 && i%3!=0 && i%5!=0				
					);
		Consumer<Integer> c = i -> System.out.println(i);
		s1.filter(p).forEach(c);
		
		
		

	}

}
