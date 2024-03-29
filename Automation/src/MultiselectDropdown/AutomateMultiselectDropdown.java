package MultiselectDropdown;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMultiselectDropdown {
public static void main(String[] args) {
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
			 driver.get("https://demoapps.qspiders.com/");
			 
}}
