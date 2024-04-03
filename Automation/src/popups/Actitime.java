package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actitime {
public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("http://rahul/login.do");
		 driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		 driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		 driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sakshi3");
		 driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		 
		 
		 driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		 driver.findElement(By.xpath("//select[@name='customerId']")).click();
		 
		 Thread.sleep(2000);
		 WebElement dropdown=driver.findElement(By.name("customerId"));
		 Select s =new Select(dropdown);
		 s.selectByIndex(2);
		 
		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mobile Application");
		 driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
		 driver.findElement(By.xpath("//a[text()='All']")).click();
		 driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='deleteButton']")).click();
		 
}}
		
		 
		 
		 
		 
