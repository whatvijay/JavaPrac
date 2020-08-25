package com.vijay.java8.streams.ocjp;

import java.util.Optional;

public class OptionalsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating optional of empty null.
		
		Optional<String> opt1 = Optional.empty();
		
		//Optional<String> opt2 = Optional.of(null);// has thrown null pointer exception.
		
		Optional<String> opt3 = Optional.ofNullable(null);
		
		System.out.println(opt1.isPresent());
		
		//System.out.println(opt2.isPresent());
		System.out.println(opt3.isPresent());

	}

}
