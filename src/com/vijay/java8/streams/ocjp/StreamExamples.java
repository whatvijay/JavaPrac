package com.vijay.java8.streams.ocjp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anyMatch example
		Stream<Integer> intStream = Stream.iterate(1,i -> i++);
		Boolean anyMatch = intStream.anyMatch(i -> i<5);
		System.out.println("anyMatch is"+anyMatch);

		// Exploring methods of double.
		// avg sum return Optional Double but count will return long.
		Stream<Double> doubleStream = Stream.of(10.0,12.0,9.0);
		
		DoubleStream ds = DoubleStream.of(10.0,12.0,2.0);
		System.out.println(ds.average());
		// stream is already closed  .IllegalStateException.
		//System.out.println(ds.count());
		//System.out.println(ds.sum());
		//ds.sum
		//doubleStream.filter(i -> i)
	
		//MapToINt explored
		
		Stream<String> stringStream = Stream.of("sbh","sbi");
		stringStream.mapToInt(s -> s.length()).forEach(System.out::println);
		Stream<String> stringStream2 = Stream.of("sbh","sbi");
		stringStream2.map(s -> s.length()).forEach(System.out::println);
		
		Stream<String> stringStream3 = Stream.of("sbh","sbi");
		//stringStream3.ma
		//there is no map to object
		//stringStream3.mapToObject(s -> s.length()).forEach(System.out::println);
		IntStream is = IntStream.empty();
		// OptioalDouble.empty
		System.out.println(is.average());
		
		// getAsDouble doesnt work on empty stream/ it gives NoSuchElementException
		//System.out.println(is.average().getAsDouble());
		
		// checking what filter  findany and anyMatch will return .
		// Stream.of("sbh","sbi").find
		// filter will return stream fndany will return optional<T> and any match will return boolean
		
		// checking if sort on stream will change value on actual List
		// Answer is no example as below
		//List<Double> doubList = new ArrayList<>();
		List<Double> dList = new ArrayList<>();
		dList.add(10.8);
		dList.add(5.3);
		Optional<Double> od = dList.stream().sorted().findFirst();
		
		System.out.println(od.get()+"values "+dList.get(0));
		
		// understanding collectors 
		//toArrayList and toMap are not present
		Stream<Character> chars  = Stream.of('a','w','e','z');
		chars.map(c -> c).collect(Collectors.toList());
		// interchange values with keys and keys with value sof a map
		// create a stream on top of entryset of map
		//using collectors toMap put  entry.value in key and vice versa.
		Map<String,String> hm = new HashMap<>();
		hm.put("key1","1");
		// will put same value to different key
		//hm.put("key2","1"); Duplicate key key1
		Map<String,String> hm2=hm.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));
		
		for(String s: hm2.keySet())
		{
			System.out.println("key is"+s);
			System.out.println("value is"+hm2.get(s));
		}
		
		Stream<String> s= Stream.of("speak","peak","cheek");
		
		Map<Integer,String> map=s.collect(Collectors.toMap(String::length,k -> k, (a,b)->a+""+b));
		System.out.println(map.size()+"  "+map.get(4));
		
		Stream<String> s2= Stream.of("speak","peak","cheek");
		s2.filter(i -> i.contains("p")).findFirst();
		
		//System.out.println(s2.);
		
	}

}
