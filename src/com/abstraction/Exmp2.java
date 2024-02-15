package com.abstraction;
 abstract class Keerthika{
	 abstract void daughter();
 }
 class madhu extends Keerthika{

	@Override
	void daughter() {
		// TODO Auto-generated method stub
		System.out.println("Kerthikaaaaaaaaaa");
	}
	 
 }
public abstract class Exmp2 {
   public static void main(String[] args) {
	madhu m=new madhu();
	m.daughter();
}
}
