package com.kais;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.kais.bean.Kais;
import com.kais.bean.Lampe;
import com.kais.bean.LampeController;
import com.kais.bean.Prise;
import com.kais.bean.PriseController;


public class TestMonBean03 {
  public static void main(String[] args) {
	 /* PropertyChangeListener contoler = new LampeController();
	  Lampe lampe = new Lampe();
	  lampe.addPropertyChangeListener(contoler);
	  
	  //System.out.println("etat = " + lampe.getEtat());
	    lampe.setEtat("on");
	    lampe.setLieu("couloir");
	    //System.out.println("etat = " + lampe.getEtat());

    //new TestMonBean03();
*/  
	  /*PropertyChangeListener priseController = new PriseController();
	  Prise prise = new Prise("", "off");
	  prise.addPropertyChangeListener(priseController);
	  
	  System.out.println("etat = " + prise.getEtat());
	  prise.setEtat("on1");
	  System.out.println("etat = " + prise.getEtat());*/
	  
	  PropertyChangeListener priseController = new PriseController();
	  Kais kais = new Kais();
	  kais.addPropertyChangeListener(priseController);
	  
	  System.out.println("etat = " + kais.getValeur());
	  kais.setValeur(5);
	  System.out.println("etat = " + kais.getValeur());

	  
  }
  
  /*public TestMonBean03() {
    MonBean03 monBean = new MonBean03();
    
    monBean.addPropertyChangeListener( new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent event) {
        System.out.println("propertyChange : valeur = "+ event.getNewValue());
      }
    } );
                               
    System.out.println("valeur = " + monBean.getValeur());
    monBean.setValeur(10);
    System.out.println("valeur = " + monBean.getValeur());
                           
	  
	    }*/
}