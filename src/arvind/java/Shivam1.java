package arvind.java;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shivam1{
 
	/*@Test
	public void login() {
		System.out.println("login completed");
   }
		@Test(dependsOnMethods="login" )
		public void logout() {
			System.out.println("logout completed");
		
		}
	*/
	@BeforeClass
	public void login() {
		System.out.println("login completed");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout completed");
		
	}
		@Test(priority=2)
		public void addemp() {
			System.out.println("Adding new emp");
		}
	@Test(priority=1)
	public void delemp() {
		System.out.println("delete emp");
	}
	}



