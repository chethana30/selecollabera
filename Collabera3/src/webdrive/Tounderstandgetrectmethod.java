package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstandgetrectmethod {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Rectangle usernameRectngleArea = driver.findElement(By.id("email")).getRect();
		System.out.println(usernameRectngleArea.x);
		System.out.println(usernameRectngleArea.y);
System.out.println(usernameRectngleArea.x);
System.out.println(usernameRectngleArea.y);


	}

}
