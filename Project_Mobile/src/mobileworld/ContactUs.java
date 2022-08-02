package mobileworld;

import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {

	@Test
	public  void contactus() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		
		driver.findElement(By.xpath("//*[contains(text(),'Support')]")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		
		Set<String> contactus = driver.getWindowHandles();
		for(String support : contactus) {
			driver.switchTo().window(support);
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Viki");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("viki123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("speaker error");
		driver.findElement(By.xpath("//input[@class='btn']")).click();
	    driver.quit();

	}

}
