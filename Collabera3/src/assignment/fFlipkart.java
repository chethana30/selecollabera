package assignment;

import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class fFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);

	}

}
