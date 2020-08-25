package com.vijay.javabasics;

import java.util.ArrayList;
import java.util.List;

public class ForEachNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		for(Integer i :l)
		{
			System.out.println(i);
		}
		//l=null;
		//for each cannot handle null
		//Exception in thread "main" java.lang.NullPointerException
		for(Integer j:l)
		{
			System.out.println(j);
		}

	}

}
