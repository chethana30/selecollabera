package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Forbackrefreshpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.navigate().forward();
		driver.get("https://www.skillray.com/");
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
