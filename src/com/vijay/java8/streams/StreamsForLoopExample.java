package com.vijay.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
//import java.util.stream.
import java.util.stream.Stream;

public class StreamsForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(11);
		Integer[] ir=intList.stream().toArray(Integer[]::new);
		for (Integer i :ir)
		{
			System.out.println(i);
		}
		Stream s1=intList.stream();
		s1.sorted(new Sorter()).forEach(x -> System.out.println(x));
		List<Tasky> taskList = new ArrayList<>();
		taskList.add(new Tasky("c"));
		taskList.add(new Tasky("c"));
		taskList.add(new Tasky("i"));
		taskList.add(new Tasky("i"));
		taskList.add(new Tasky("c"));
		List<String> s=taskList.stream().filter(task -> (task.status.equalsIgnoreCase("c"))).map(task -> task.status+"comp").collect(Collectors.toList());
		s.forEach((si)-> System.out.println(si));
		
		long n=1000l;
		Boolean b=LongStream.rangeClosed(2l,(long)Math.sqrt(n)).allMatch(i -> n%i!=0);
		System.out.println(b);
		
		Boolean b2 = LongStream.rangeClosed(2l,(long)Math.sqrt(n)).anyMatch(i -> n%i==0);
		System.out.println(b2);
		
		//LongStream.rangeClosed(2,10).
	}

	
	
}

	class Tasky
	{
		String status="c";
		Tasky(String stat)
		{
			this.status=stat;
		}
	}
		
	//sorting compare first variable is the second one in the list.
	class Sorter implements Comparator<Integer>
	{

		public int compare(Integer i,Integer j)
		{
			System.out.println(i+""+j);
			return j-i;
		}
	}