package com.demo.thread;

public class Consumer implements Runnable{

	Q q;
	public Consumer(Q q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	
	public void run(){
		
		while(true){
			q.getN();
		}
		
		
	}
	
}
