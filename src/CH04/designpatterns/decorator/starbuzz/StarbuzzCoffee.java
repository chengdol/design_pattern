package CH04.designpatterns.decorator.starbuzz;

// main class
public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		// 主体
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());

		Beverage beverage2 = new HouseBlend();
		
		// 加其他香料
		// 这就是为什么大家都extend from Beverage class的原因
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
	}
}
