package JavaProgram;

class One
{
	void play()
	{
		System.out.println("Kulkarni");
	}
}
class Two extends One
{
	void school()
	{
		System.out.println("Vasudev");
	}
}
public class MultilevelInherit extends Two{
	void playschool()
	{
		System.out.println("Prajwal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInherit m=new MultilevelInherit();
		m.playschool();
		m.school();
		m.play();
	}

}
