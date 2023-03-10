package lab_Sessions22_12_22;

// write a code to implement multiple interface in two different classes.

    interface Printable { 
	   void display();
	}
	interface Calculate { 
	   int  cal(int n);
	}
	
	class Calsq implements Printable, Calculate { // class calculate square implement both interfaces
		
	   public void display() {
	      System.out.print("square of a number:");
	   }
	   public int cal(int a) {
	      return a*a;
	   }
	}
	class Calcube implements Printable, Calculate {  // class calculate cube implement both interfaces
		
		   public void display() {
		      System.out.print("Cube of a number: ");
		   }
		   public int cal(int a) {
		     return a* a *a;
		   }
	}
	
public class UseInterfa { 
	
    public static void main(String args[]) {
    	
	Calsq cs = new Calsq(); // class object
	cs.display();           
	System.out.println(cs.cal(5));
	
	Calcube cc = new Calcube();
	cc.display();
	System.out.println(cc.cal(5));
	
    }
}
