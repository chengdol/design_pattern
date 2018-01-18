package CH03.designpatterns.observer.weather;

// observer interface
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
