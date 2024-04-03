package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
		 driver.findElement(By.xpath("//a[text()='Login']")).click();
		 Thread.sleep(2000);
		 
		 Robot r=new Robot(); 
		 r.keyPress(KeyEvent.VK_A);
		 r.keyPress(KeyEvent.VK_D);
		 r.keyPress(KeyEvent.VK_M);
		 r.keyPress(KeyEvent.VK_I);
		 r.keyPress(KeyEvent.VK_N);

		 
		 r.keyRelease(KeyEvent.VK_A);
		 r.keyRelease(KeyEvent.VK_D);
		 r.keyRelease(KeyEvent.VK_M);
		 r.keyRelease(KeyEvent.VK_I);
		 r.keyRelease(KeyEvent.VK_N);
		 
		 Thread.sleep(2000);
		 
		 //PRESS TAB
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 
		 //PRESS ENTER
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);

}}
