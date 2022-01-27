package webdrive;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitleflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		System.out.println(driver.getPageSource());
		

	}

}
