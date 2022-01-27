package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class uber {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.uber.com/login/?breeze_local_zone=phx3&next_url=https%3A%2F%2Fm.uber.com%2F&state=Tj-GyXY_GWRzLOxrdSpQrhJKts1XzP5RtsWfgqe4Rmg%3D");
driver.findElement(By.linkText("safety")).click();
	}

}
