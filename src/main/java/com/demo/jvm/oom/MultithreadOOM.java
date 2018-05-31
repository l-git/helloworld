package com.demo.jvm.oom;

import org.junit.Test;

public class MultithreadOOM {

	
	private static class SimpleThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			try {
				Thread.sleep(10^10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	@Test
	public void t1(){
		
		for(int i=0;i<15000000;i++){
			
			new Thread(new SimpleThread(),"tread "+i).start();
			
			System.out.println("thread "+i+" created");
			
			
		}
		
		
		/*Cglibbean c;*/
		
		
	}
	
	
}
