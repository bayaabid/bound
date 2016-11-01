package com.kais.bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LampeController implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if( evt.getPropertyName()== "etat"){
		System.out.println("propertyChange1 : Nom = "+ evt.getPropertyName());
		System.out.println("propertyChange1 : etat = " + evt.getNewValue());
		}
		
		if(evt.getPropertyName().equals("lieu")){
		System.out.println("propertyChange : Nom = "+ evt.getPropertyName());
		System.out.println("propertyChange : lieu = " + evt.getNewValue());
		}

	}

}
