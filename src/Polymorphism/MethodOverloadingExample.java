package Polymorphism;
class Addition{
	public int add(int a, int b) {
		return a+b;
		
	}


 public int add(int a,int b,int c) {
	 return a+b+c;
 }
}
public class MethodOverloadingExample {
	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.add(34,45));
		System.out.println(a.add(56, 67, 78));
	}

}

