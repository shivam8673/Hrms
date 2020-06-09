package arvind.java;

import java.awt.AWTException;
import java.io .FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shivam {
	public static void main(String[]args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium-eclipse\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        //driver.get("https://www.facebook.com/");
        //Thread.sleep(4000);
        /*Alert a = driver.switchTo().alert();
         a.accept();
         */
       // Thread.sleep(3000);
       /* WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(4000);
       // driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span")).click();
	*/
     /*   driver.switchTo().frame("\"gstl_50 sbdd_c\"");
        driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[2]/div[2]/ytd-compact-link-renderer[2]/a/paper-item/yt-formatted-string[1]")).click();
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
       
       */
       // driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shivamkumarkothari@gmail.com");
      //  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("");
       /*
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(4000);
        System.out.println("login completed");
        */
     /*  WebDriverWait wait = new WebDriverWait(driver,15);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"u_0_b\"]")));
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	System.out.println("login completed");
	 driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
	 Thread.sleep(5000);
	 */
   /*  WebElement element = driver.findElement(By.name("Log In"));
     JavascriptExecutor executor = (JavascriptExecutor) driver ;
      executor.executeScript("arguments[0].click;",element);
*/
  /*  driver.navigate().to("file:///D:/selenium-eclipse/dropdownNavigate.html");
        Select drpdwn = new Select(driver.findElement(By.name("OptWeb")));
        drpdwn.selectByVisibleText("Yahoo");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/form/input")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().to("file:///D:/selenium-eclipse/multiselectdropdown.html");
        Select drpdwn1 = new Select(driver.findElement(By.id("tools")));
        Thread.sleep(4000);
        drpdwn1.selectByVisibleText("Selenium IDE");
        Thread.sleep(4000);
        drpdwn1.selectByIndex(1);
        Thread.sleep(4000);
        drpdwn1.selectByIndex(3);
        Thread.sleep(4000);
        driver.close();
        */
		/*driver.get("file:///D:/selenium-eclipse/multiplewindows.html");
		driver.findElement(By.id("btn1")).click();
	    Thread.sleep(4000);
		driver.findElement(By.id("btn2")).click();
	    Thread.sleep(4000);
	     ArrayList<String>wind=new ArrayList<String>(driver.getWindowHandles());
		
         driver.switchTo().window(wind.get(0));
         Thread.sleep(4000);
         */
	/*	driver.get("file:///D:/selenium-eclipse/WebTable.html");
		int row =   driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		int rowcol = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		 System.out.println(row);
		 System.out.println(col);
		 System.out.println(rowcol);
		 String data1 = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[4]/td[3]")).getText();
		 System.out.println(data1);
        for(int i=1;i<=row;i++){
        // String data = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
       //  System.out.println(data);
	      for ( int j=1;j<=col;j++) {
	    	  String data2 = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	    	  System.out.println(data2);}
	    	  }*/
		FileInputStream fis = new FileInputStream ("‪C:\\Users\\Praveen Kumar\\Downloads\\WriteData.xlsx");
       XSSFWorkbook workbook = new XSSFWorkbook(fis);
       XSSFSheet sheet = workbook.getSheet("test");
       System.out.println(sheet.getSheetName());
       System.out.println(sheet.getLastRowNum());
       System.out.println("before updating cell data"+ sheet.getRow(2).getCell(1));
	}    
            
        
	}
