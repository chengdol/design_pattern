package CH02.designpatterns.strategy;

// main class
public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		//================================
		model.performFly();	
		// update behavior
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
