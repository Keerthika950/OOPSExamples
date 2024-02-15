package Interfaces;
interface Animal{
	void a();
	
}
interface Dod{
	void a();
}
class DD implements Animal,Dod{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("gsvdgsv");
	}
	
}
public interface MultipleInheritance {
public static void main(String[] args) {
	DD d=new DD();
	d.a();
	
}
}
