package WorkWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinkText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569900&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D9040229%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAiA29auBhBxEiwAnKcSqvpnOXKHGkGwyEm6SIXJ0lVFqPzQh3PZ_VHVsioCRqJUPvFIKYybShoCUkcQAvD_BwE");
		WebElement stf=driver.findElement(By.name("firstname"));
		stf.sendKeys("Aishwarya");
		WebElement stf1=driver.findElement(By.name("lastname"));
		stf1.sendKeys("Bhapkar");
		
		WebElement stf2=driver.findElement(By.name("reg_email__"));
		stf2.sendKeys("aishwaryapadaval@gmail.com");
		WebElement stf3=driver.findElement(By.name("reg_email_confirmation__"));
		stf3.sendKeys("aishwaryapadaval@gmail.com");
		WebElement stf4=driver.findElement(By.name("reg_passwd__"));
		stf4.sendKeys("aishwarya2025");
		
		WebElement stf5=driver.findElement(By.id("month"));
		stf5.sendKeys("dec");
		WebElement stf6=driver.findElement(By.id("day"));
		stf6.sendKeys("30");
		WebElement stf7=driver.findElement(By.id("year"));
		stf7.sendKeys("2000");
		
		WebElement stf8=driver.findElement(By.cssSelector("input[value='1']"));
		stf8.click();
		
		WebElement stfA=driver.findElement(By.name("websubmit"));
		stfA.click();
		
}
}
