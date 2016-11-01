package com.kais.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Prise extends PropertyChangeSupport {
	
	
	private static final long serialVersionUID = 1L;
	private String etat;
	
	public Prise(Object sourceBean) {
		super(sourceBean);
		
		
	}
	
	
	public Prise(Object sourceBean, String etat) {
		super(sourceBean);
		this.etat = etat;
	}


	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		String oldValue = this.etat;
		this.etat = etat;
		super.firePropertyChange("etat", oldValue, this.etat);
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.addPropertyChangeListener(listener);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.removePropertyChangeListener(listener);
	}
	
	
}
