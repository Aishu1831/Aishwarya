package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBlinkIt {
public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver=new ChromeDriver();
			 
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://blinkit.com/");
				driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
				//driver.findElement(By.xpath("(//div[text()='Pune, Maharashtra, India'])[1]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[@class='SearchBar__PlaceholderContainer-sc-16lps2d-0 dPbxWD']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("sugar",Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[text()='ADD'])[4]")).click();
		 //       driver.findElement(By.xpath("(//div[@role='button'])[24]")).click();
				WebElement addButton = driver.findElement(By.xpath("(//button[@class='tw-flex'])[3]"));
				for (int i = 1; i < 3; i++) {
					addButton.click();
					Thread.sleep(1000);
				}
				

			
				}}
