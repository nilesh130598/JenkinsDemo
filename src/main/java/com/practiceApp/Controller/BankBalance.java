package com.practiceApp.Controller;


public class BankBalance {
int Cpin;
int addedmoney;

public BankBalance(){
	
}
public BankBalance(int id, int addedmoney) {
	super();
	this.Cpin = id;
	this.addedmoney = addedmoney;
}
public int getCpin() {
	return Cpin;
}
public void setCpin(int cpin) {
	Cpin = cpin;
}
public int getAddedmoney() {
	return addedmoney;
}
public void setAddedmoney(int addedmoney) {
	this.addedmoney = addedmoney;
}



}
