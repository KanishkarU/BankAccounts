package org.bankaccount;

public class Results {
	
	public static void main(String[] args) {
		
		BankDetails a = new BankDetails();
		
	a.setUsername("Kanishkar");
	String username = a.getUsername();
	
	System.out.println(username);
	a.setUsername("Saran");
	String username2 = a.getUsername();
	System.out.println(username2);
	a.setUsername("Oviya");
	System.out.println(a.getUsername());
	a.setUsername("Asha");
	System.out.println(a.getUsername());
	a.setUsername("Ashwin");
	System.out.println(a.getUsername());
	a.setUsername("kani");
	System.out.println(a.getUsername());
	
	a.setPassword(456);
	System.out.println(a.getPassword());
	a.setPassword(6656);
	
	
	System.out.println(a.getPassword());
	a.setPassword(77);
	System.out.println(a.getPassword());
	a.setPassword(11);
	System.out.println(a.getPassword());
	a.setPassword(888);
	System.out.println(a.getPassword());
	a.setPassword(2011);
	System.out.println(a.getPassword());
	

	
	
	
	
	
	
		
		
	}

	
	
}
