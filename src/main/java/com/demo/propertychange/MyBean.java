package com.demo.propertychange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyBean {

	private String s1;
	private String s2;
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		
		propertyChangeSupport.firePropertyChange("s1", this.s1, this.s2);
		
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	
	
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	
	
	public void addPropertyChangeListener(PropertyChangeListener listener){
		
		propertyChangeSupport.addPropertyChangeListener(listener);
		
	}
	
	
	
	
	
}
