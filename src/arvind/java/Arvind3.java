package arvind.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arvind3 {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium-eclipse\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String arv=driver.getCurrentUrl();
		System.out.println(arv);
		 Object arvi=driver.getClass();
		System.out.println(arvi);
		System.out.println("arvind");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/iframe[1]")).click();
        Thread.sleep(4000);
	}

}


