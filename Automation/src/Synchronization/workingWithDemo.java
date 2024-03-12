package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithDemo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("file:///C:/Users/user/Desktop/Fruits.html");
	 List<WebElement> Fruits=driver.findElements(By.id("dropdown"));
		for(int i=0;i>5;i++);
	 
	 
	 
}
}
