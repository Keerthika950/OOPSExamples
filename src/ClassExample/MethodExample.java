package ClassExample;

class Employee{
	String name;
	int rollno;
	 public void employee(String name,int rollno){
		 this.name=name;
		 this.rollno=rollno;
		
	}
	 void display(){
System.out.println(name+" "+rollno);
		 
	 }

}
public class MethodExample {
	public static void main(String[] args) {
		Employee e=new Employee();
	e.employee("fdrfd", 1);
	e.display();
		
		
		
	}
	

}
