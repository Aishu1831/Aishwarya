package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElementsMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);

	List<WebElement> ipadName=driver.findElements(By.xpath("//div[@class='_4rR0']"));
	for(int i=0;i < ipadName.size();i++) {
		System.out.println(ipadName.get(i).getText());
	}
	
}
}
