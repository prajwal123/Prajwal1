package JavaProgram;
class Prajwal{
	int num;
	String name;
	Prajwal(int a)
	{
		System.out.println("Prajwal");
	}
	Prajwal(int a,float b)
	{
		System.out.println("Kulkarni");
	}
}
public class Constructor1a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prajwal p=new Prajwal(1);
		Prajwal a=new Prajwal(1,1.0f);
		System.out.println(p.num);
		System.out.println(p.name);
		System.out.println(a.num);
		System.out.println(a.name);
		}
}