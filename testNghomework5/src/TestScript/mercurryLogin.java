package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectRepository.automationPracticePages;

public class mercurryLogin {


WebDriver driver;  




@BeforeTest


	public void setupTest() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
	
		
		
	 	 
	 	driver = new ChromeDriver();
	 	
	 	driver.manage().window().maximize();
	 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		 		
		
		Thread.sleep(2000); 	
		
		
		
		
		
		
}

@Test 

public void loginTest() {
	
	webelement username = driver.findElement(By.name)
	
	
}




}