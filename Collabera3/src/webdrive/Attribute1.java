package webdrive;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("sushmitha");
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("sush1166");
		driver.findElemen(by.cssSelector)()

	}

}
