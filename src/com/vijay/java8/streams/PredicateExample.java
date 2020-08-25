package com.vijay.java8.streams;
import java.util.function.Predicate;
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Predicate<Integer> p = i -> (i%2==0);
      System.out.println(p.test(101));
      System.out.println(p.test(102));
      System.out.println(p.test(103));
		
      Predicate<String> sp = s -> (s.equals("abcd"));
      System.out.println(sp.test("abcd"));
      System.out.println(sp.test("cvfgt"));
      System.out.println(sp.test("abcde"));
      System.out.println(sp.negate().test("abcd"));
      
      //Predicate<Integer> x = f -> (f%2);
      Predicate<PredicateConsumed> pc = pcv ->(pcv.i==0&&pcv.j==0);
      System.out.println(pc.test(new PredicateConsumed()));
      System.out.println(pc.test(new PredicateConsumed(1,2)));
	}
	
	

}

class PredicateConsumed
{
	int i=0;
	int j=0;
	PredicateConsumed()
	{
		
	}
	PredicateConsumed(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
