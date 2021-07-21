package JavaProgram;

class A
{
	int i=10;
}

public class Super2 extends A {
	int i=20;
	void show(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 s=new Super2();
		s.show(30);
	}

}