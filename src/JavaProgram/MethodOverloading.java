package JavaProgram;

public class MethodOverloading {
	void sample()
	{
		System.out.println("Prajwal");
	}
	static void sample(int a)
	{	
		System.out.println(a);
		System.out.println("Vasudev");
	}
	static void sample(int a,double b)
	{	
		System.out.println(a+" "+b);
		System.out.println("Kulkarni");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading s=new MethodOverloading();
		s.sample();
		sample(1);
		sample(2,2.0);
	}

}
