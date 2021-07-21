package JavaProgram;

public class NonStaticMethods {
	void one()
	{
		System.out.println("Prajwal");
	}
	
	void two()
	{
		System.out.println("Vasudev");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NonStaticMethods p=new NonStaticMethods();
		//p.one();
		new NonStaticMethods().one();
		//p.two();
		new NonStaticMethods().two();
		//System.out.println("Kulkarni");
		three();
	}
	static void three()
	{
		System.out.println("Kulkarni");
	}
}
