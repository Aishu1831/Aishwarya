package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNaukriCom {
public static void main(String[] args) throws InterruptedException  {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//open naukri
	driver.get("https://www.naukri.com/");
	
	//click on regeister button
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	
	//enter name in name
	driver.findElement(By.id("name")).sendKeys("aishwarya");
	
	//enter email
	driver.findElement(By.id("email")).sendKeys("aishwarya@gmale.com");
	
	//enter pwd
	driver.findElement(By.id("password")).sendKeys("aishwarya12345");
	
	//enter mobile no
	driver.findElement(By.id("mobile")).sendKeys("888888888888");
	
	//click on fresher
	driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
	//enter current location
	driver.findElement(By.xpath("//span[text()='Pune']")).click();

	//click on check box
	driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
	
	//click on register
	driver.findElement(By.xpath("//button[text()='Register now']")).click();
	
	
	//click on login
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	//enter email
	driver.findElement(By.id("usernameField")).sendKeys("majanu@fmale.com");
	//Enter pwd
	driver.findElement(By.id("passwordField")).sendKeys("aishul");
	//click on login button
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}}