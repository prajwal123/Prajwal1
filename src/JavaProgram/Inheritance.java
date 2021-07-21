package JavaProgram;

class Kulkarni
{
	void school()
	{
		System.out.println("Kulkarni");
	}
}
public class Inheritance extends Kulkarni {
	void system()
	{
		System.out.println("Prajwal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance i=new Inheritance();
		i.system();
		i.school();
	}

}
