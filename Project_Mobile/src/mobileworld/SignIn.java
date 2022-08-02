package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn extends Webdriver {

     WebDriver driver;
	
	public  void signIn()  {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("username")).sendKeys("Viki871");
		driver.findElement(By.id("password")).sendKeys("Viki9876543");
		driver.findElement(By.linkText("Log In")).click();
		
		
		
		

	}

}
