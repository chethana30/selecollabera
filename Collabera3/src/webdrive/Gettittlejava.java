package webdrive;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettittlejava {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://zoom.us/");
		String titleofthepage=driver.getTitle();
		System.out.println(driver.getTitle());
	}

}


