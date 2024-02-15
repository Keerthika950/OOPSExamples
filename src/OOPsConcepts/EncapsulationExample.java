package OOPsConcepts;
class Student{
	private String name;
	private int rollno;
	private String Address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
}
public class EncapsulationExample {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("abc");
		s.setRollno(111);
		s.setAddress("kadapa");
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(s.getAddress());
		
		
	}

}
