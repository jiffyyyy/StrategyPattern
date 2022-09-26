
public class ThaiDuck extends Duck {
	public ThaiDuck() {
		quackBehavior = new kab();
		flyBehavior = new FlyRocketPowered();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Thai Duck");
	}

}
