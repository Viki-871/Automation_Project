package mobileworld;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		@BeforeMethod
		public  void invoke() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		}
		
		@AfterMethod
		public void close() {
			driver.quit();
		}

	}


