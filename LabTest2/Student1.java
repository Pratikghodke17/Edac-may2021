class Student {
   public void displayInfo() {
      System.out.println("Student");
   }
}
class Marks extends Student {
   @Override
   public  void displayInfo() {
      System.out.println("Marks");
   }
}
class Result extends Marks{
	@Override
	   public void displayInfo() {
	      System.out.println("Result");
	}
}
public class Student1{
	   public static void main(String [] args) {
		  Result a1 = new Result();
		  a1.displayInfo();
		   
		  Marks d1 = new Marks();
	      d1.displayInfo();
	      
	      Student b1 = new Student();
	      b1.displayInfo();
	      }
}