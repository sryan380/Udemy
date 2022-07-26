package classesPart1;

public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int teeth;
	private int tail;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("dog is chewing");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eating");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog is walking");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog is running");
		move(10);
	}
	
	private void movelegs(int speed) {
		System.out.println("Dog.movesLegs() called");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("dog.move called");
		movelegs(speed);
		super.move(speed);
	}
	
}
