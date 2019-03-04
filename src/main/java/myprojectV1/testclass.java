package myprojectV1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:/Users/sudhakar/workspace/myprojectV1/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/v3/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr178830");
		driver.findElement(By.name("password")).sendKeys("hYbesUj");
		driver.findElement(By.name("btnLogin")).click();

	}

}
