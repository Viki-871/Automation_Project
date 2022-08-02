package mobileworld;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	
    @Test
	public void homePage() throws InterruptedException {
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
		driver.findElement(By.xpath("(//input[@id='inputFirstName'])[2]")).sendKeys("Viki");
		driver.findElement(By.id("inputEmail")).sendKeys("viki123@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Vikihgfdsz");
		driver.findElement(By.id("flexRadioDefault1")).click();
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9876543210");
		driver.findElement(By.id(" address1")).sendKeys("No-1,Second floor");
		driver.findElement(By.id("address2")).sendKeys("Nehru street");
		driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
		
	    WebElement selectState =  driver.findElement(By.id("inputState"));
	    Select state = new Select(selectState);
	    state.selectByVisibleText("Karnataka");
	    
	    driver.findElement(By.id("inputZip")).sendKeys("560021");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@rel='samsung']")).click();
	    
	    WebElement mobileType = driver.findElement(By.className("multi_select"));
	    Select mobile = new Select(mobileType);
	    mobile.selectByVisibleText("Apple 13 ");
	    
	    
	    

	}

}
