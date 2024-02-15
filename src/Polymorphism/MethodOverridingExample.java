package Polymorphism;
 class Vehicle{
	 void run() {
		 System.out.println("Vehicle is running");
		 
	 }
 }
	 class Car2 extends Vehicle{
		 
		 void run() {
			 System.out.println("car is going");
		 }
	 }
 
public class MethodOverridingExample {
	public static void main(String[] args) {
		Car2 obj=new Car2();
		obj.run();
		
		
	}

}
