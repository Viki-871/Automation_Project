package mobileworld;

import org.testng.annotations.Test;

import dataProvider.DP001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn extends Webdriver{

     
	
    @Test (dataProvider="DataMobile" ,dataProviderClass=DP001.class)
	public  void signIn(String username, String password) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");*/
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.linkText("Log In")).click();
		driver.close();
		
		
		
		

	}

}
