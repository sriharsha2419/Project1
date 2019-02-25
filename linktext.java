package seleniumclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammul\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    //driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[7]/a")).click();
   
    
   WebElement element = driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']"));
    int i = element.findElements(By.tagName("a")).size();
    System.out.println(i);
    
   //element.findElements(By.tagName("td")).get(6).click();
    for (int j=0;j<i;j++) {
    	System.out.println(element.findElements(By.tagName("a")).get(j));
       }
	}

}

