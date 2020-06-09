package arvind.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Aggg {
	 
	@Test
	public void print() {
		System.out.println("print anything");
	}
	 
	 
	 @Test(dependsOnMethods="print")
	 public void state() {
		 System.out.println("what");
	 }
	

}
