package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class WorkingWithScrollScreenShot {
public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("confirmBtn")).click();
		 WebElement goldCoin=driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(goldCoin).perform();
		 driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']")).click();
        WebElement bluestone=driver.findElement(By.xpath("//h1[@class='page-title title-14']"));
		 
		 File src=bluestone.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./Screenshot/bluestone.png");
		 Files.copy(src,dest);
		 //full web page screenshot
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src1=ts.getScreenshotAs(OutputType.FILE);
		 File dest1=new File("./Screenshot/blustone1.png");
		 Files.copy(src1,dest1);
		 //scroll till end 
         WebElement Gifting=driver.findElement(By.xpath("//span[text()='Corporate Gifting']"));
		 
	     org.openqa.selenium.Rectangle rect=Gifting.getRect();
		 int x=rect.getX();
		 int y=rect.getY();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy("+x+","+y+");");
		 
		 //pass the email
		 driver.findElement(By.xpath("//input[@name='newsletter_subscriber']")).click();
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('newsletter_subscriber').value='aishwarya@gmail.com';");
		 //click o subscribe
		 driver.findElement(By.xpath("//input[@value='SUBSCRIBE']")).click();
		 
}
		 
		 
}
