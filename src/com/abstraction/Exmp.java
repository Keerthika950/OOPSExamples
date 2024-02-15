package com.abstraction;


abstract class abstractExample {
	abstract void Bike();
	void car() {
		System.out.println("car");
	}
		
}

class cat extends abstractExample{

	@Override
	void Bike() {
		System.out.println("bikikeeee");
		// TODO Auto-generated method stub
		
	}

}
public class Exmp{
	public static void main(String[] args) {
		cat c=new cat();
		c.Bike();
		c.car();
	}
}


	



