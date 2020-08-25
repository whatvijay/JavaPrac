package com.vijay.threadPrac;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExexServiceCallableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exS =  Executors.newFixedThreadPool(5);
		
		CallableThread ct = new CallableThread();
		CallableThread ct2 = new CallableThread();
		Future fi = exS.submit(ct);
		Future fi2 = exS.submit(ct2);
		try {
		System.out.println(fi.get().toString());
		System.out.println(fi2.get().toString());
		}
		catch(Exception e)
		{
			
		}
	}

}


class CallableThread implements Callable
{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		while(i<100)
		{
			i++;
		Thread.sleep(20);
		}
		return i;
	}
	
}