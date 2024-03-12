package WorkWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTagName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement stf=driver.findElement(By.id("email"));
	stf.sendKeys("9359583151");
	WebElement stf1=driver.findElement(By.name("pass"));
	stf1.sendKeys("Bhapkar@2025");
	WebElement stf2=driver.findElement(By.name("login"));
	stf2.click();
	
	
      
}
}
