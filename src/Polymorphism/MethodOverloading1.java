package Polymorphism;
class Subtraction{
	public int sub(int x,int y) {
		return x-y; 
	}

public int sub(int x,int y,int z) {
	return x-y-z;
	
}
}
public class MethodOverloading1 {
 public static void main(String[] args) {
	Subtraction s=new Subtraction();
	System.out.println(s.sub(45, 67));
	System.out.println(s.sub(67, 45, 34));
	
}
}
