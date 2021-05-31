import java.util.Scanner;

interface dateAndTime{
	void dispTime_InSec(int min);
	
	void dispTime_Inhrs(int min);
}
class Time implements dateAndTime{
	public void Accept_min() {

	}

	@Override
	public void dispTime_InSec(int min) {
		
		int sec = min*60;
		System.out.println("TIME IN SEC: "+sec);
	}

	@Override
	public void dispTime_Inhrs(int min) {
		int hr = min/60;
		System.out.println("TIME IN HOURS: "+hr);
	}
	
		
	}
	

public class Inter{

	public static void main(String[] args) {
	Time date = new Time();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter min");
	int min= sc.nextInt();
	date.Accept_min();
	date.dispTime_Inhrs(min);
	date.dispTime_InSec(min);
	sc.close();
	}

}
