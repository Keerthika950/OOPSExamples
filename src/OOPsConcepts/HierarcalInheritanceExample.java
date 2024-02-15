package OOPsConcepts;
class Anima{
	public void monkey() {
		System.out.println("screaming");
		
	}
} 
class Parrott extends Anima{
	public void parro() {
		System.out.println("singing");
	}
}
class Donkey extends Anima{
	public void donkey2() {
		System.out.println("shouting");
	}
}
public class HierarcalInheritanceExample {
	public static void main(String[] args) {
		Donkey d=new Donkey();
		d.donkey2();
		d.monkey();
		
		
		
	}
	

}
