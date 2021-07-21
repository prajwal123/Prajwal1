package JavaProgram;

class Asd
{
	void mad()
	{
		System.out.println("mad");
	}
}
class Fgh extends Asd
{
	void owl()
	{
		System.out.println("owl");
	}
}

public class HybridInherit extends Fgh {
	void cat()
	{
		System.out.println("cat");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridInherit bd=new HybridInherit();
		bd.cat();
		bd.owl();
		bd.mad();
		Jkl j1=new Jkl();
		j1.dog();
		j1.mad();
	}

}
class Jkl  extends Asd
{
	void dog()
	{
		System.out.println("Dog");
	}
}