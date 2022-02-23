package com.practiceApp.Controller;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credit implements Serializable {
	
	  @Id
      int Cpin;
	  int Camount;
       
      
     public Credit(){
    	  
      }
	public Credit(int cpin, int camount) {
		super();
		
		this.Cpin = cpin;
		this.Camount = camount;
	}
	public int getCpin() {
		return Cpin;
	}
	public void setCpin(int cpin) {
		this.Cpin = cpin;
	}
	public int getAmount() {
		return  Camount;
	}
	public void setAmount(int amount) {
		this.Camount = amount;
	}
	@Override
	public String toString() {
		return "Credit [Cpin=" + Cpin + ", Camount=" + Camount + ", getCpin()=" + getCpin() + ", getAmount()="
				+ getAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
      
}
