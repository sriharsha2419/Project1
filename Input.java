package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Input {

	// testing github
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.gecko.driver","C:\\Users\\ammul\\Desktop\\agama\\tools\\geckodriver-v0.21.0-win64\\geckodriver.exe");
   WebDriver driver;
   /*FirefoxOptions options = new FirefoxOptions();
    *options.setCapability("marionette",false);
    */
   driver = new FirefoxDriver();
   driver.get("https://facebook.com");
   String str= driver.getTitle();
   System.out.println(str);
  // driver.manage().window().maximize();
   
   //passing elements into textboxes
   driver.findElement(By.id("u_0_c")).sendKeys("Sri Harsha");
   driver.findElement(By.id("u_0_e")).sendKeys("Komiri");
   driver.findElement(By.id("u_0_h")).sendKeys("sriharshakomiri@gmail.com");
   driver.findElement(By.id("u_0_o")).sendKeys("harsha1234");
   driver.findElement(By.id("u_0_9")).click();
   Select s = new Select(driver.findElement(By.id("month")));
   s.selectByIndex(9);
   Select s1 = new Select(driver.findElement(By.id("day")));
   s1.selectByIndex(13);
   Select s2 = new Select(driver.findElement(By.id("year")));
   s2.selectByVisibleText("1994");
	}

}
