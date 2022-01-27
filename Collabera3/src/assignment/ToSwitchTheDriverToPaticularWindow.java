package assignment;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToSwitchTheDriverToPaticularWindow {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");


	}

}
