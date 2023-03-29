package com;

public class Customer implements Mytra {
	 public void payment() {
			System.out.println("payment");
			
		}
		 public void purchase() {
			 System.out.println("purchasing");
		 }


	public static void main(String[] args) {
	 Customer c=new Customer();
	 c.payment();
	 c.purchase();
	 System.out.println(Phonepe.id);
 System.out.println(Mytra.mid);
	}
	
}
