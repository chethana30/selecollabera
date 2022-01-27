package webdrive;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tounderstandgettextfeild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.actitime.com/");
WebElement TextOnThePage=driver.findElementByClassName(By.cla5ss("class=\"start-trial__title\"));"
		TextOnThePage.getText();
		

	}

}
