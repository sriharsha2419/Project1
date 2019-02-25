package seleniumclass3;

import java.io.IOException;



public class gmail_window {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().exec("C:\\Users\\ammul\\Desktop\\agama\\tools\\FileUpload.exe");
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammul\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://www.guru99.com/become-an-instructor.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"jfCard-welcome-start\"]")).click();;
	    driver.findElement(By.xpath("//*[@id=\"first_28\"]")).sendKeys("sri");
	    driver.findElement(By.xpath("//*[@id=\"last_28\"]")).sendKeys("harsha");
	    driver.findElement(By.xpath("//*[@id=\"cid_28\"]/div/div[3]/button[2]")).click();
	    //driver.close();*/
	}

}
