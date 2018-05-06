package chapter05; // inheritance

import ipi.Views;

/**
 * ManagerTest class Listing 5.1
 * Employee class Listing 5.2
 * Manager Employee Listing 5.3
 * This program demonstrates inheritance.
 * @version 1.21 2004-02-21
 * @author Cay Horstmann
 */
public class ManagerTest {
	private static final String MAIN_CLASS = "chapter05.Chapter05";
	private static String message = "";

	public static void main(String[] args) {
		// construct a Manager object
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		// fill the staff array with Manager and Employee objects
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		// print out information about all Employee objects
		for (Employee e: staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
		
		Views.openWindowOpener(MAIN_CLASS, message);
	}
}