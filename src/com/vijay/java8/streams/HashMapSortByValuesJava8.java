package com.vijay.java8.streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapSortByValuesJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer,Integer> hm = new HashMap();
			hm.put(9, 9);
			hm.put(6,6);
			hm.put(7,7);
			Map<Integer,Integer> sm =hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),(oldvalue,newvalue)-> oldvalue,LinkedHashMap::new ));
			//Stream.of(hm).collect(Collectors.)
			for(Entry e: sm.entrySet())
			{
				System.out.println(e.getKey()+""+e.getValue());
			}
			
	}

}
