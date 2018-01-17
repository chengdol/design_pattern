package CH07.designpatterns.collections.iterator_builtin;

import java.util.Iterator;


// 这个例子用的是java 自带的iterator interface
public class Cafe {

	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		// with iterators
		Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<String>  dinerIterator = dinerMenu.createIterator();

		System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator); 
	}
 
	private static void printMenu(Iterator<String> iterator) {
		while (iterator.hasNext()) {
			String menuItem = (String)iterator.next();
			System.out.println(menuItem);

		}
	}
}
