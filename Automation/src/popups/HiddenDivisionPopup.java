package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		 driver.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']")).sendKeys("Aishwarya");
		 driver.findElement(By.xpath("//input[@class='w-full m-2 h-10 px-4 border-2 border-stone-600 rounded-md']")).sendKeys("Bhapkar");
		 Thread.sleep(2000);
	     WebElement dropdown= driver.findElement(By.className("w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md"));
	      Select s=new Select(dropdown);
	      s.selectByValue("laptop");
		 
		 
		 
}}
