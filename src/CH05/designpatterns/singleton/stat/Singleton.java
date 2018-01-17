package CH05.designpatterns.singleton.stat;


// thread safe implementation
public class Singleton {
	// created when class is loaded by JVM
	// before any thread can access it
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
