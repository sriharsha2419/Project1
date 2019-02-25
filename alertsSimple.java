package seleniumclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/telecom/index.html");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[4]/a")).click();
	     driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("harsha");
	     driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1234");
	     driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	     driver.switchTo().alert().accept();
	     
	}

}
