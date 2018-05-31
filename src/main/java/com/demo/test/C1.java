package com.demo.test;

import java.util.Properties;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;

public class C1 {

	
	
	@Test
	public void t1(){
		
		
		XStream x=new XStream();
		
		
		
	     Properties properties = new Properties();
	     properties.setProperty("resource.loader", "maggie");
	     properties.setProperty("maggie.resource.loader.description", "Maggie Template");
	     properties.setProperty("maggie.resource.loader.class", "com.xyzq.simpson.maggie.utility.template.MaggieTemplateLoader");
	     
	     properties.setProperty("resource.manager.cache.class", "com.xyzq.simpson.maggie.utility.template.MaggieResourceCache");
	     properties.setProperty("maggie.resource.loader.cache", "true");
	     properties.setProperty("input.encoding", "UTF-8");
	     properties.setProperty("output.encoding", "UTF-8");
		
	     
	     
	     
	     
	     
		
	}
	
	
}
