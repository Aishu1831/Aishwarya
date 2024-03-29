package WorkingWithMouseOver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithFlipcart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement fashion=driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		
		Actions act=new Actions(driver);
	 	act.moveToElement(fashion).perform();
		driver.findElement(By.xpath("//a[text()='Women Footwear']")).click();

		WebElement brand=driver.findElement(By.xpath("//div[@data-id='SHOGH3Y29E3ERWYG']/descendant::div[text()='Fabbmate']"));
		
		WebElement price=driver.findElement(By.xpath("//div[@data-id='SHOGH3Y29E3ERWYG']/descendant::div[text()='₹299']"));

		System.out.println(brand.getText()+"-----"+price.getText());
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		
		WebElement jobs=driver.findElement(By.xpath("//li[@class='dropdown  xs-hidden']"));
		
		
		Actions act1=new Actions(driver);
	 	act1.moveToElement(jobs).perform();
	 	
	 	driver.findElement(By.xpath("//a[text()='Jobs @ India']")).click();
	 	Thread.sleep(2000);
	 	
	 	driver.findElement(By.xpath("//a[text()='Candidate Login']")).click();
	 	
	 	driver.findElement(By.name("username")).sendKeys("aishwaryapadaval@gmail.com");
	 	
	 	driver.findElement(By.name("password")).sendKeys("aishu12");
	 	
	 	driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	 	
	 	driver.findElement(By.id("loginbtn")).click();

	}


}

