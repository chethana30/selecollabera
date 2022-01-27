package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Dimension dimension=driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("height"+dimension.getHeight());
		System.out.println("width"+dimension.getWidth());
	}
}
