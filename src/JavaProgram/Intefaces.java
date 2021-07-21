package JavaProgram;
interface I1
{
	void show();
}
interface I2
{
	void display();
}
public class Intefaces implements I1 {
	public void show()
	{
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intefaces i=new Intefaces();
		i.show();
		i.display();
	}

}
