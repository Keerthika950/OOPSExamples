package ClassExample;
class Teacher{
	String name;
	int rollno;
	double salary;
	Teacher(String n,int r){
		name=n;
		rollno=r;
	}
		Teacher(String n,int r,double d){
			name=n;
			rollno=r;
			salary=d;
			
		
	}
	
	
	
	void display() {
		
		System.out.println(name+" "+rollno+" "+salary);
	
	}
	
}
public class ConstructorExample {
	public static void main(String[] args) {
		Teacher t=new Teacher("hema",111);
		Teacher t1=new Teacher("gfgf",112,2000);
	
		
		t.display();
		t1.display();
		
	}
	

}
