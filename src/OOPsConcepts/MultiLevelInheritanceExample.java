package OOPsConcepts;
class Animal{
	public void Dog() {
		System.out.println("barking");
		
	}
}
class Cat extends Animal{
	public void horse() {
	System.out.println("Eating");
}
}
class Parrot extends Cat{
	public void cat2() {
	System.out.println("singing");
}
}
public class MultiLevelInheritanceExample {
	public static void main(String[] args) {
		Parrot p=new Parrot();
		p.cat2();
		p.horse();
		p.Dog();
	}
}


