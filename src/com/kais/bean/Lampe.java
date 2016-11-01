package com.kais.bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Lampe  {

	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	protected String etat;
	protected String lieu;
	
	PropertyChangeSupport changeSupport;
	
   public Lampe() {
		
		changeSupport = new PropertyChangeSupport(this);
		this.etat = "off";
		this.lieu = "salon";
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		String oldEtat = this.etat;
		this.etat = etat;
		this.firePropertyChange("etat", oldEtat, this.etat);
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		String oldLieu = this.lieu;
		this.lieu = lieu;
		this.firePropertyChange("lieu", oldLieu, this.lieu);
	}

	

	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		changeSupport.addPropertyChangeListener(listener);
	}

	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		changeSupport.removePropertyChangeListener(listener);
	}

	
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}


	public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub
		changeSupport.firePropertyChange(propertyName, oldValue, newValue);
	}

	
	public void firePropertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		changeSupport.firePropertyChange(event);
	}
	
	

}
