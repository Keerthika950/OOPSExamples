package Polymorphism;
class Bank{
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 2;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 4;
	}
}
class Union extends Bank{
	int getRateOfInterest() {
		return 6;
	}
}
class Axis extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
public class MethodOverridingExample1 {
	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		Union u=new Union();
		Axis a=new Axis();
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
		System.out.println(u.getRateOfInterest());
		System.out.println(a.getRateOfInterest());
	}

}
