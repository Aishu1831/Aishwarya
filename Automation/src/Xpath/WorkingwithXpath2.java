package Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithXpath2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://paytm.com/");

		driver.findElement(By.xpath(
				"//img[@src=\'https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png\']"))
				.click();

		driver.findElement(By.xpath("//span[@class=\"_1Oyg-\"]")).click();


		driver.findElement(By.xpath("//input[@class='_1X2Sn _1DJkH']")).clear();


		driver.findElement(By.className("//(div[text()='Chennai, Tamil Nadu, India')")).click();

	
		driver.findElement(By.xpath("//span[@id=\'destCity\']")).click();
		
		driver.findElement(By.xpath("//input[@class='_1X2Sn _1DJkH']")).clear();
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Hamad International')]")).click();
		
		driver.findElement(By.xpath("//span[@id=\'departureDate\']")).click();

		

		driver.findElement(By.xpath("(//div[text()='4'])[2]")).click();

		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();



		
		List<WebElement> flight = driver.findElements(By.className("_1gMv6"));

		for (int i = 0; i < flight.size(); i++) {
			System.out.println(flight.get(i).getText());
			System.out.println("============================");
		}

	
	}
}


