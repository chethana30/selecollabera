package assignment;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class string {

	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.naukri.com/");
	     
	     String ParentWindowId=driver.getWindowHandle();
	     Set<String> allWindowIds=driver.getWindowHandles();
         allWindowIds.remove(ParentWindowId);
         
         for(String ParentWindowId1 : allWindowIds) {
        	 driver.switchTo().window(ParentWindowId1);
        	 driver.close();
         }
         

	}

}
