//import java.io.Console;
import java.util.Scanner;


public class EmpClient {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	//	Console c=System.console();
		Scanner scan = new Scanner(System.in);
		Employee e1=new Employee();
		e1.Display();
		//c.readLine();
		scan.nextLine();
		scan.close();
		// TODO Auto-generated method stub

	}

}
