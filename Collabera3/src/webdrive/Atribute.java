package webdrive;

import org.openqa.selenium.chrome.ChromeDriver;

public class Atribute {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.instagram.com/");
	driver.FindElement(By.cssSelector(""))

	}

}
