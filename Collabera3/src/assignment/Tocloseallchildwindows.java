package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tocloseallchildwindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentWindowID=driver.getWindowHandle();
		SetallWindowIDs=driver.getWindowHandles();
		Set<String> allWindowIDs;
		allWindowIDs.remove(parentWindowID);
		for(String WindowID:allWindowIDs) {
			driver.switchTo().window(WindowID);
			driver.close();
			
		}

	}

}
