

public class DecoratorConcrete1 extends Decorator{
	
	private Component component;
	
	public DecoratorConcrete1(Component component) {
		super(component);
	}
	
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}
	
	private void doAnotherThing(){
		System.out.println("this is b");
	}
}
