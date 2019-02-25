package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class inputs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ammul\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://facebook.com");
    driver.manage().window().maximize();
    
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
