package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingchrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}

}
