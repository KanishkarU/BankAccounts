package org.bankaccount;

public class BankDetails {
private String username ;
private int password;

public void setUsername(String name) {
	if(name.equals("Kanishkar")) {
		this.username="kanishar acc";
		
	}
	else if(name.equals("Saran")) {
		this.username="Saran acc";
	}
	else if(name.equals("Oviya")) {
		this.username="Oviya acc";
	}
	else if(name.equals("Ashwin")) {
		this.username="Ashwin acc";
	}
	else if(name.equals("Asha")) {
		this.username="Asha acc";
	}
	else {
		this.username="Incorrect username";
	}
}


public String getUsername() {
	return username;
}
public void setPassword(int pwd) {
	if(pwd==456) {
		this.password=1;
		
	}
	else if (pwd ==6656) {
		this.password=6788;
	
}
 else if(pwd == 77) {
	this.password=88;
}
else if(pwd==888) {
	this.password=99;
}
else if(pwd==11) {
	this.password=8888;
}
	
	
else {
	this.password=5656;
}
}
	public int getPassword() {
		return password;
		
		
	}
}
