package JavaProgram;

class Abc
{
	void prj()
	{
		System.out.println("super");
	}
}
class Abcd extends Abc
{
	void prj()
	{
		System.out.println("Sub");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abcd a1=new Abcd();
		a1.prj();
		Abc a2=new Abc();
		a2.prj();
	}

}
