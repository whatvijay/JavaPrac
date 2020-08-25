package com.vijay.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordCountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> l= new ArrayList<>();
			l.add("word1");
			l.add("word2");
			l.add("word1");
			l.add("word1");
			l.add("word1");
			l.add("word2");
			l.add("word2");
			l.add("word2");
			l.add("word3");
			l.add("word3");
			
			l.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting())).forEach((k,v) -> System.out.println(k+""+v));
			//l.stream().
			
			
	}

}
