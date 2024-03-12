package WorkWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			WebElement stf=driver.findElement(By.name("username"));
			stf.sendKeys("aishu_1831");
			WebElement stf1=driver.findElement(By.name("password"));
			stf1.sendKeys("Bhapkar@2025");
			WebElement stf2=driver.findElement(By.className("_acap"));
			stf2.click();
}
}

