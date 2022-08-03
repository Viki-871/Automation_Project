package mobileworld;

import org.testng.annotations.Test;

import dataProvider.DP002;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp extends Webdriver {

	
	@Test(dataProvider="SignUpData", dataProviderClass=DP002.class)
	public void signUp(String firstName, String lastName, String email,String password, String dob, String phoneNumber, String bio) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");*/
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(dob);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//*[@placeholder='Short Bio']")).sendKeys(bio);
		driver.findElement(By.xpath("//*[@type='Submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		
		
		
		

	}

}
