package seleniumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loginyahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
			
		driver.findElement(By.name("firstName")).sendKeys("Harry");
		driver.findElement(By.name("lastName")).sendKeys("Sharma");
		driver.findElement(By.name("yid")).sendKeys("harrtjekhitk3@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("hary@1234");
		driver.findElement(By.name("phone")).sendKeys("7038947745");
		driver.findElement(By.name("mm")).sendKeys("January");
		
		driver.findElement(By.name("dd")).sendKeys("19");
		driver.findElement(By.name("yyyy")).sendKeys("1987");
		driver.findElement(By.name("freeformGender")).sendKeys("female");
		
		
		
	}

}
