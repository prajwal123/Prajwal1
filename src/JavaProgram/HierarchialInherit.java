package JavaProgram;

class Nine
{
	void playschool()
	{
		System.out.println("Playschool");
	}
}
class Ten extends Nine
{
	void school()
	{
		System.out.println("school");
	}
}
public class HierarchialInherit extends Nine {
	void play()
	{
		System.out.println("Play");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ten t1=new Ten();
		t1.school();
		t1.playschool();
		HierarchialInherit h1=new HierarchialInherit();
		h1.play();
		h1.playschool();
	}

}
