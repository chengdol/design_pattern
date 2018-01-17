package CH04.designpatterns.decorator.starbuzz;


// also extend from Beverage
public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
