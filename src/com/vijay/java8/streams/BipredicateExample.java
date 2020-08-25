package com.vijay.java8.streams;
import java.util.function.BiPredicate;
//import java.util.function.


public class BipredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> checksTwoIntEqual = (param1,param2)->(param1==param2);
		
		System.out.println(checksTwoIntEqual.test(2,2));
		System.out.println(checksTwoIntEqual.test(2,3));

	}

}
