package com.vijay.threadPrac;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreesetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubr
		
		Set<Stock> s = new TreeSet(); 
		Stock s1= new Stock();
		s1.setStockName("stock1");
		s1.setStockPrice(100);
		Stock s2 = new Stock();
		s2.setStockName("stock2");
		s2.setStockPrice(200);
		s.add(s1);
		s.add(s2);
		s1.setStockPrice(300);
		//System.out.println(s);
		Iterator i =s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

class Stock implements Comparable
{
	String stockName;
	int stockPrice;
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", stockPrice=" + stockPrice + "]";
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Stock comparedStock = (Stock) o;
		return this.stockPrice -comparedStock.stockPrice ;
	}
	
}