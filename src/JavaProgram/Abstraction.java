package JavaProgram;
abstract class Vehicle{
	int tyres;
	abstract void start();
}
class Car extends Vehicle{
	int tyres=2;
	void start()
	{
		System.out.println("Car starts with key");
		System.out.println(tyres);
	}
}
public class Abstraction extends Vehicle{
	int tyres=4;
	void start()
	{
		System.out.println("Scooter starts with key");
		System.out.println(tyres);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.start();
		Abstraction a=new Abstraction();
		a.start();
	}
}
