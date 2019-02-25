package seleniumclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pop_upEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammul\\Desktop\\agama\\tools\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   //driver.get("https://www.w3schools.com/");
    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
    driver.manage().window().maximize();
    //driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div/a")).click();
    driver.findElement(By.xpath("//div[@class='w3-bar']//a[@title='Save']")).click();
    
    
	}

}
