package arvind.java;

 
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArvTestNg {
	@BeforeMethod
	public void login() {
		System.out.println("login completed");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout completed");
	}
	@Test(description="printing")
	public void print() {
		System.out.println("print anything");
		Reporter.log("1.Application opened");
	}
	@Test(dependsOnMethods="print")
	public void check() {
		System.out.println("vani");
	}
	

}
