package JavaProgram;
class Test
{
	int i;
	void setValue(int i)
	{
		this.i=i; //refer to instance variable
	}
	void show()
	{
		System.out.println(i);
	}
}
public class This2pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.setValue(10);
		t.show();
	}

}
