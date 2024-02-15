package Static;

class Student10{
	String name;
	int marks;
	static String college="Svce";

Student10(String n,int m){
	name=n;
	marks=m;
}
	void display() {
	System.out.println((name+" "+marks+" "+college));
	}
}

public class StaticVariableExample {
public static void main(String[] args) {
	Student10 s1=new Student10("keerthika",60);
	Student10 s2=new Student10("Keerthi",79);
	s1.display();
	s2.display();
}
}
