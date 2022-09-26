
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new flyNoway();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Decoy Duck");

	}

}
