package com.practiceApp.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
    int Cpin;
    String Cname;
    
   public Customer(){
	   
   }
	public Customer(String cname, int cpin) {
		super();
		
		this.Cpin = cpin;
		this.Cname = cname;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String Cname) {
		this.Cname = Cname;
	}
	public int getCpin() {
		return Cpin;
	}
	public void setCpin(int cpin) {
		this.Cpin = cpin;
	}
	@Override
	public String toString() {
		return "Customer [Cname=" + Cname + ", Cpin=" + Cpin + ", getCname()=" + getCname() + ", getCpin()=" + getCpin()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
}
