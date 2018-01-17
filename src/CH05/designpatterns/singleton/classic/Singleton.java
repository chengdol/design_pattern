package CH05.designpatterns.singleton.classic;

// NOTE: This is not thread safe!

public class Singleton {
	
	// here why static?
	// because we use static method return the instance
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
