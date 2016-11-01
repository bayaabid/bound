package com.kais.bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PriseController implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		
		System.out.println("propertyChange1 : Nom = "+ evt.getPropertyName());
		System.out.println("propertyChange1 : etat = " + evt.getNewValue());
		
		System.out.println("Soure  : " + evt.getOldValue());

	}

}
