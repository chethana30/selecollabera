package webdrive;

import org.openqa.selenium.chrome.ChromeDriver;

public class Forbackrefresh {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://zoom.us/");
			Thread.sleep(5000);
			driver.navigate().forward();
			driver.get("https://www.zomato.com");
			driver.navigate().back();
			driver.navigate().refresh();
		

	}

}
