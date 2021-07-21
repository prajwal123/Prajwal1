package JavaProgram;

class Five
{
	Five()
	{
		System.out.println("Hello");
	}
}
class Six extends Five
{
	Six()
	{	super();
		System.out.println("Hii");
	}
}
class Seven extends Six
{
	Seven()
	{	super();
		System.out.println("Byee");
	}
}
public class SuperCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Seven();
		
	}

}
