package WorkWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement stf=driver.findElement(By.name("FirstName"));
		stf.sendKeys("Aishwarya");
		WebElement stf1=driver.findElement(By.name("LastName"));
		stf1.sendKeys("Bhapkar");
		WebElement stf2=driver.findElement(By.id("Email"));
		stf2.sendKeys("aishwaryapadaval7@gmail.com");
		WebElement stf3=driver.findElement(By.name("Password"));
		stf3.sendKeys("aishwarya2025");
		WebElement stf4=driver.findElement(By.name("ConfirmPassword"));
		stf4.sendKeys("aishwarya2025");
		WebElement stf5=driver.findElement(By.name("register-button"));
		stf5.click();
		
		
}
}
