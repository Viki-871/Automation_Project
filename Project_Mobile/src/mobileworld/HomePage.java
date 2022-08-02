package mobileworld;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.findElement(By.id("myInput")).sendKeys("Samsung");
		driver.findElement(By.linkText("Order")).click();
		
		Set<String> order = driver.getWindowHandles();
		for(String mobile : order) {
			driver.switchTo().window(mobile);
		}
		
		driver.findElement(By.id("inputFirstName")).sendKeys("Vignesh");

	}

}
