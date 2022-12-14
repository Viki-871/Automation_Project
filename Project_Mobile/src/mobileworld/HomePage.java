package mobileworld;

import org.testng.annotations.Test;

import dataProvider.DP004;

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

public class HomePage extends Webdriver {
	
    @Test(dataProvider="OrderData", dataProviderClass=DP004.class)
	public void homePage(String mobileName, String firstName, String lastName, String email, String password, String phoneNumber, String address1,String address2, String city, String postCode, String count) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");*/
		
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.findElement(By.id("myInput")).sendKeys(mobileName);
		driver.findElement(By.linkText("Order")).click();
		
		Set<String> order = driver.getWindowHandles();
		for(String mobile : order) {
			driver.switchTo().window(mobile);
		}
		
		driver.findElement(By.id("inputFirstName")).sendKeys(firstName);
		driver.findElement(By.xpath("(//input[@id='inputFirstName'])[2]")).sendKeys(lastName);
		driver.findElement(By.id("inputEmail")).sendKeys(email);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		driver.findElement(By.id("flexRadioDefault1")).click();
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(phoneNumber);
		driver.findElement(By.id(" address1")).sendKeys(address1);
		driver.findElement(By.id("address2")).sendKeys(address2);
		driver.findElement(By.id("inputCity")).sendKeys(city);
		
	    WebElement selectState =  driver.findElement(By.id("inputState"));
	    Select state = new Select(selectState);
	    state.selectByVisibleText("Karnataka");
	    
	    driver.findElement(By.id("inputZip")).sendKeys(postCode);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@rel='samsung']")).click();
	    driver.findElement(By.xpath("//*[@rel='apple']")).click();
	    
	    Thread.sleep(1000);
	    WebElement mobileType = driver.findElement(By.xpath("(//select[@class='multi_select'])[3]"));
	    Select mobile = new Select(mobileType);
	    mobile.selectByVisibleText("Apple 12");
	    
	    driver.findElement(By.xpath("//*[@placeholder='no of mobiles']")).sendKeys(count);
	    
	    
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
	    Assert.assertEquals(message,"Your Order has been Placed Successfully!\nHappy Shopping.........");
	    
	    driver.findElement(By.linkText("Close")).click();
	   // driver.quit();
	    
	    
	    
	    
	    
	    
	    

	}

}
