package com.vijay.java8.streams;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer biConsumer = (a,b) ->System.out.print(a+""+b);
		
		biConsumer.accept(5, 4);
		biConsumer.accept(5, 6);
	}

}
