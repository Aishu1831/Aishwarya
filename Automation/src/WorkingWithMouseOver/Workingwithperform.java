package WorkingWithMouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithperform {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	 WebElement rightbutton=driver.findElement(By.id("btn30"));
	 
}
}
