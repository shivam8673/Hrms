package arvind.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 
public class ArvOrngHrm {
	public static String un="Admin";
	public static String pw="admin123";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium-eclipse\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pw);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		WebElement element= driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Arvind");
	}

}
