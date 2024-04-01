package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwagDemo {
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		 List<WebElement> BackPack=driver.findElements(By.xpath("//div[text()='Sauce Labs Backpack']"));
		 List<WebElement> Prize=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		 for(int i=0;i < BackPack.size();i++) {
				System.out.println(BackPack.get(i).getText()+"--------------"+Prize.get(i).getText());}
		 
		 driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']")).click();
		 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Aishwarya");
		 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Bhapkar");
		 driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("416010");
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 
		 String actual_title=driver.getTitle();
		  String expected_title="$29.99";
	      if(actual_title.equals(expected_title)) 
	       {
			   
	    	  System.out.println("TestCase is Pass");
		   }
	      else 
	      {
		  
			  System.out.println("TestCase is fail");
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./Screenshot/demo.png");
		 Files.copy(src,dest);
}}}		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 

		
