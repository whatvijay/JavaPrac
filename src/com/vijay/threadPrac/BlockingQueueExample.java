package com.vijay.threadPrac;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(5);
		bq.add(10);
		bq.add(20);
		bq.add(30);
		bq.add(40);
		bq.add(50);
		if(bq.remainingCapacity() ==0) {
			bq.remove(10);
		bq.add(60);
		}
		if(bq.remainingCapacity() ==0) {
			bq.remove(20);
		bq.add(70);		
		}
		

	}
	

}
