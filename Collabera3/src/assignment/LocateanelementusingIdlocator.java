package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateanelementusingIdlocator {
public static void main(string[]arg) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.className("Login")).click();
	driver.findElement(By.name("username")).sendKeys("chethanagshsn@gmail.com");
	driver.findElement(By.name("password")).sendKeys("chethu@ammu");
	driver.
	
}
}

 