package com.vijay.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		Stream<Integer> si = Stream.iterate(1,i -> i+1);
		
		si.filter(i -> i <5 & i>0).forEach(System.out::println);
		si.close();
		//si.filter(i -> i <5 & i>0).forEach(System.out::println);
		//si.filter(i -> i <8).forEach(System.out::println);
	
		//intList.stream()
		
	}

}
