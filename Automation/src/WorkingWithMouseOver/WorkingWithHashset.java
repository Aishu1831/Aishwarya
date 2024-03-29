package WorkingWithMouseOver;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithHashset {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/user/Desktop/Fruits.html");
	Select s = new Select(driver.findElement(By.id("dropdown")));
	
	List<WebElement> duplicateOptions= s.getOptions();
	 
	HashSet<String> t = new HashSet<String>();
	
	for(int i=0; i<duplicateOptions.size();i++)
	{
		String duplicate=duplicateOptions.get(i).getText();
		t.add(duplicate);
	}
		for(String option:t)
		{
			System.out.println(option);
		}
}}
