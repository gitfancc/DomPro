

public class DecoratorConcrete extends Decorator{
	
	private Component component;
	
	public DecoratorConcrete(Component component) {
		super(component);
	}
	
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}
	
	private void doAnotherThing(){
		System.out.println("this is c");
	}
}
