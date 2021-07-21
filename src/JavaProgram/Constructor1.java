package JavaProgram;

public class Constructor1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor1(1);
		new Constructor1(1,0.1f);
		new Constructor1(1,1.1f,'A');
		}
	Constructor1(int a)
	{
		System.out.println(a);
	}
	Constructor1(int a,float b)
	{
		System.out.println("vasudev");
	}
	Constructor1(int a,float b,char c)
	{
		System.out.println("kulkarni");
	}
}