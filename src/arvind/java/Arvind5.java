package arvind.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arvind5 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium-eclipse\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String baseUrl="https://www.guru99.com/selenium-tutorial.html";
	driver.get(baseUrl);
	//driver.get("https://www.guru99.com/selenium-tutorial.html");
	//driver.switchTo().frame("classFrame");
	//driver.findElement(By.linkText("Deprecated")).click();
	//driver.close();

	}
	
}
