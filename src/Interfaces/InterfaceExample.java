package Interfaces;
interface pranavi{
	void run();
}

abstract class tanmai implements pranavi{

 abstract void doggg();
	
	
}
class people extends tanmai{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runninggggggg");
	}

	@Override
	void doggg() {
		// TODO Auto-generated method stub
		System.out.println("eatinggggggggg");
	}
	
}

public interface InterfaceExample {
	public static void main(String[] args) {
		people t=new people();
		t.run();
		t.doggg();
	}

}
