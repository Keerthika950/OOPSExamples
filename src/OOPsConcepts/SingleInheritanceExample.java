package OOPsConcepts;
class Parent{
	public void sheep() {
		System.out.println("partingggg");
		
		
	}
}
	class Child extends Parent {
		public void Bird() {
			System.out.println("shouting");	
		}
		
		
	}
	

public class SingleInheritanceExample {
	public static void main(String[] args) {
		Child c=new Child();
		c.Bird();
		c.sheep();
		
		
	}
	

}
