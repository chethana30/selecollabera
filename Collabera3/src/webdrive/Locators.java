package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.skillrary.com/");
			Thread.sleep(3000);
			driver.findElement(By.linkText("x")).click();
			WebElement usernameTextFeild=driver.findElement(By.id("email"));
			usernameTextFeild.clear();
			usernameTextFeild.sendKeys("sum","an","th","c","L",Keys.CONTROL+"a");
			Thread.sleep(3000);
			usernameTextFeild.sendKeys(Keys.CONTROL+"c");
			WebElement passwordTextfeild=driver.findElement(By.name("pass_fields"));
			passwordTextfeild.clear();
			Thread.sleep(3000);
			WebElement passwordTextField = null;
			passwordTextField.sendKeys(Keys.CONTROL+"v");
			
			
			
		

	}

}
