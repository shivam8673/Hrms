package arvind.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArvindTestNG {
	WebDriver driver;
	@BeforeMethod
	public void check() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium-eclipse\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	}
	@Test(priority=2)
	public void openfb() {
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void openirctc() {
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
