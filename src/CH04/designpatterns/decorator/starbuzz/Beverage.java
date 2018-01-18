package CH04.designpatterns.decorator.starbuzz;


// will be extended by concrete component or decorator
// have two concrete components

// HouseBlend
// Espresso

// decorator class also extend from here
public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
