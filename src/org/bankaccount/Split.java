package org.bankaccount;


public class Split {
	
	public static void main(String[] args) {
		String k = "k";
		String k3 ="h";
		
		StringBuilder k1 = new StringBuilder("k");
		
		StringBuilder k2 = new StringBuilder("k");
		
		
		
		System.out.println(System.identityHashCode(k1));
		System.out.println(System.identityHashCode(k2));
		System.out.println(System.identityHashCode(k));
		System.out.println(System.identityHashCode(k3));
		
	String concat = k.concat(k3);
	System.out.println(concat);
	StringBuilder append = k2.append(k1
			);
	
	System.out.println(append );
	
	System.out.println(System.identityHashCode(concat));
	System.out.println(System.identityHashCode(append));
	
	
		
		
		
	
	
			
		}
		
		
		
		
	
		
		
		
	}


