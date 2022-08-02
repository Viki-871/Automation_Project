package mobileworld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	
	@Test
	public  static void signUp() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Viki");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("viki123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("XXXXXXXX");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("04-03-1998");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@placeholder='Short Bio']")).sendKeys("Enthusiastic Person");
		driver.findElement(By.xpath("//*[@type='Submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}
