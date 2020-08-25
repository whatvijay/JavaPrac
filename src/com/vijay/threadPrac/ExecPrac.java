package com.vijay.threadPrac;
//https://www.baeldung.com/java-rejectedexecutionhandler
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecPrac {

	
	public static void main(String args[])
	{
		
		ExecutorService exServfp = Executors.newFixedThreadPool(5);
		//ThreadFactory tf = new ThreadFactory("tf1");
		
		ExecutorService exServ = Executors.newFixedThreadPool(5);
		NewThread nt = new NewThread();
		NewThread nt2 = new NewThread();
		NewThread nt3 = new NewThread();
		NewThread nt4 = new NewThread();
		NewThread nt5 = new NewThread();
		NewThread nt6 = new NewThread();
		//NewThread nt7 = new NewThread();
		//NewThread nt8 = new NewThread();
		//exServ.submit(nt);
		//exServ.submit(nt2);
		//exServ.submit(nt3);
		//exServ.submit(nt4);
		//exServ.submit(nt5);
		//exServ.submit(nt6);
		
		//Executors.
		
		//Thread t = new Thread(
		//});
		//ThreadPoolExecutor(6, 1, 0,  gave illegal argument exception
		ExecutorService exServ2 = new ThreadPoolExecutor(3, 4, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5),new RejectionPolicy());
		//System.out.println(exServ2.);
		exServ2.submit(nt);
		exServ2.submit(nt2);
		exServ2.submit(nt3);
		exServ2.submit(nt4);
		exServ2.submit(nt5);
		exServ2.submit(nt6);
		exServ2.submit(nt6);
		exServ2.submit(nt6);
		exServ2.submit(nt6);
		exServ2.submit(nt6);
		
	}
}

class NewThread  implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<100)
		{
			i++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("100");
		}
		
		
	}
	
}



class RejectionPolicy implements RejectedExecutionHandler
{
	 private final Lock lock = new ReentrantLock();

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
	lock.lock();
	 try {
		executor.setMaximumPoolSize(executor.getMaximumPoolSize() + 2);
	 }
	 catch(Exception e)
	 {
		 
	 }
	 finally
	 {
		 lock.unlock();
	 }
		executor.submit(r);
		
	}
	
}