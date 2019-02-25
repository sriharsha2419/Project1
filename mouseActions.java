package seleniumclass3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammul\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    
	    
	    //for right click
	    
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]"));
	    Actions a = new Actions(driver);
	    a.moveToElement(element).contextClick().build().perform();
	    
	    
	    // for double click
	    
	   /* WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]"));
	    Actions a = new Actions(driver);
	    a.moveToElement(element).doubleClick().build().perform();*/
	    
	    
	    //for mouse hoover
	    
	   /*WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]"));
	    Actions a = new Actions(driver);
	    a.moveToElement(element).build().perform(); */
	    
	    
	}

}
