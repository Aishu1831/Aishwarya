package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMyntra {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//open myntra
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Jeans",Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='common-checkboxIndicator'][1]")).click();
	driver.findElement(By.xpath("//input[@value='2569.0 TO 3301.0'][1]")).click();
}
}
