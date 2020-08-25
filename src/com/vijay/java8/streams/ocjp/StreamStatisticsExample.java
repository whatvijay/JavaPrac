package com.vijay.java8.streams.ocjp;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;

public class StreamStatisticsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream is = IntStream.of(100,200,300,400,500);
		IntSummaryStatistics iss=is.summaryStatistics();
		
		System.out.println(iss.getAverage());
		System.out.println(iss.getCount());
		System.out.println(iss.getSum());

		Stream<String> stringStream = Stream.of("ABCD","DING");
		// summary statics is for int only
		stringStream.forEach(System.out::println);
		// so each string is treated as a whole not a separate string for each literal in"ABCD".
		Stream<String> stringStream2 = Stream.of("ABCD","DING");
		stringStream2.peek(System.out::println);
		
		//Stream<String> stringStream = Stream.of("ABCD","DING");
		
		Stream<String> s3 = Stream.of("b","abn","c","cvbn");
		s3.sorted().findAny().ifPresent(System.out::println);
		// after sorted what is the first elememnt findAny will return it.t
		
		// checking partitionBy
		Stream<Boolean> booleanStream = Stream.of(true,false,true,false,false);
		
		Map<Boolean ,List<Boolean>> boolMap = booleanStream.collect(Collectors.partitioningBy(b->b));
		System.out.println(boolMap);
		
		//Getting streams of various lists.
		//Stream bigStream = Stream.of(s3,booleanStream,boolMap);
			
		//Stream.of(s3,booleanStream,boolMap).flatMap(i -> i).forEach(System.out::println);
		
		
	}

}
