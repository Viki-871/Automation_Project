package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	WebDriver driver;
	
	public  void signUp() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		

	}

}
