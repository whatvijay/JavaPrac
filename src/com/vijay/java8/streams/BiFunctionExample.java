package com.vijay.java8.streams;
import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> biFunction = (param1,param2)-> (param1*param2);
		
		System.out.println(biFunction.apply(2, 3));
		System.out.println(biFunction.apply(3, 4));
	}

}
