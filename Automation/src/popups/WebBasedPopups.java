package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedPopups {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.demoblaze.com/");
		 driver.findElement(By.xpath("//a[@id='login2']")).click();
         driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Aishwarya");
         driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Aishu");
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		 driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		 Thread.sleep(3000);
         Alert alt=driver.switchTo().alert();
		 alt.accept();
	
		 driver.findElement(By.xpath("//a[text()='Home ']")).click();
		 driver.findElement(By.xpath("//img[@src='imgs/iphone_6.jpg']")).click();
		 driver.findElement(By.xpath("//a[@onclick='addToCart(5)']")).click();
		 Thread.sleep(3000);
         Alert alt1=driver.switchTo().alert();
		 alt1.accept();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='cartur']")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aishwarya");
		 driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		 driver.findElement(By.xpath("//input[@id='card']")).sendKeys("hgsdyt3e62t3u2hhdwd");
		 driver.findElement(By.xpath("//input[@id='month']")).sendKeys("December");
		 driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
		 
		 driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
		 driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
		 
		 
}}
