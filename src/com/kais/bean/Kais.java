package com.kais.bean;

import java.beans.PropertyChangeSupport;

public class Kais implements Listenable {
	
	protected int valeur = 2;
	

	PropertyChangeSupport changeSupport;
	
	public Kais() {
	
		changeSupport = new PropertyChangeSupport(this);
	}

	@Override
	public PropertyChangeSupport getPropertyChangeSupport() {
		
		return changeSupport;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		//this.valeur = valeur;
		
		int oldValeur = this.valeur;
		this.valeur = valeur;

		changeSupport.firePropertyChange("valeur", oldValeur, this.valeur);
	}
   
	
}
