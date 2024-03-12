package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoApp {
public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver=new ChromeDriver();
			 
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//li[text()='Disabled']")).click();
			 Thread.sleep(2000);
			 WebElement Name = driver.findElement(By.xpath("(//input[@name='name']"));
              System.out.println(Name.isEnabled());
}}  