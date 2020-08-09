/**
 * 
 */

/**
 * @author Shrivalli
 *
 */
public class Employee {
	public int Empid;
	public String Empname;
	public float Salary;

	public Employee()
	{
		Empid=101;
		Empname="Radha";
		Salary=98000.43f;
	}
	
	public void Display()
	{
		System.out.println("Your ID is "+Empid);
		System.out.println("Your Name is "+Empname);
	    System.out.println("Your Salary is "+Salary);
	}
}
