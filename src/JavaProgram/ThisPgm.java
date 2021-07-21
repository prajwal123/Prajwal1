package JavaProgram;

public class ThisPgm {
	ThisPgm(int a)
	{
		System.out.println(a);
		System.out.println("Prajwal");
	}
	ThisPgm(int c,float b)
	{
		this(1);
		System.out.println(c+" "+b);
		System.out.println("Vasudev");
	}
	ThisPgm(float e,char f)
	{
		this(5,5.2f);
		System.out.println(e+" "+f);
		System.out.println("Kulkarni");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisPgm(1.4f,'B');
	}

}
