package seleniumclass3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_UpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammul\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    
	    //scrolling up and down
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    // scrolling window by pixel.
	    //js.executeScript("window.scrollBy(0,1000)");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //scrolling window till the end of the page.
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    
	   //scrolling window till the particular element - it scrolls till amazon logo near footer
	   // WebElement element =  driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div"));
	   //js.executeScript("arguments[0].scrollIntoView();", element);
	    
	}

}
