package com.vijay.java8.streams;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first parameter is boolean and second param is input
		Function<Integer,Integer> f1 = f ->(f%2);
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(20));
		System.out.println(f1.apply(-1));
		//f1.
		//Function<Integer,Boolean> f2 = f -> (if(f) {return 1})
		
		
	}

}
