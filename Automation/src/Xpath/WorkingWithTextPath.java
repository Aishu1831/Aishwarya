package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextPath {
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=mvr9tajbqs3l");
		
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		 
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='content users']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rahul");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aishul");
		 
		 driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Aishu");
		 
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aishwarya");
		 
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bhapkar");
		 
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9359583151");
		 
		 driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("88888888");
		 
		 driver.findElement(By.xpath("//input[@type='submit' and @value='   Create User   ']")).click();
		 
		 driver.findElement(By.xpath("//a[@class='logout']")).click();

	    
	}}

