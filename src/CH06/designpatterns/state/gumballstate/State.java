package CH06.designpatterns.state.gumballstate;



// super state interface
public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
