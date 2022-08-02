package mobileworld;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
	    driver.findElement(By.xpath("//*[@rel='apple']")).click();
	    
	    Thread.sleep(2000);
	    WebElement mobileType = driver.findElement(By.xpath("(//*[@class='multi_select'])[3]"));
	    Select mobile = new Select(mobileType);
	    mobile.selectByVisibleText("Apple 13 ");
	    
	    driver.findElement(By.xpath("//*[@placeholder='no of mobiles']")).sendKeys("1");
	    
	    
	    WebElement element = driver.findElement(By.id("bought"));
	    Select prev_Order = new Select(element);
	    prev_Order.selectByValue("0");
	    
	    Thread.sleep(1000);
	    driver.findElement(By.id("gridCheck1")).click();
	    System.out.println( driver.findElement(By.id("gridCheck1")).isSelected());
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//*[@for='gridCheck1'])[2]")).click();
	    
	    driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
	    
	    String message =  driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	    System.out.println(message);
	    AssertJUnit.assertEquals(message,"Your Order has been Placed Successfully!\nHappy Shopping.........");
	    
	    driver.findElement(By.linkText("Close")).click();
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
