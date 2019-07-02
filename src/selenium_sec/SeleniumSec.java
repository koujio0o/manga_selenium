package selenium_sec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumSec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("gagagaDD");


	      //System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	      System.setProperty("webdriver.gecko.driver", "./exe/geckodriver.exe");
	      DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setCapability("marionette", true);
			WebDriver driver = new FirefoxDriver(cap);
			driver.navigate().to("http://www.google.com");
			driver.findElement(By.id("lst-ib")).sendKeys("Selenium3");
			driver.findElement(By.name("btnK")).click();
			if(driver!=null) {
				driver.close();
			}





/*
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.google.com/xhtml");
	      //Thread.sleep(5000);  // Let the user actually see something!
	      WebElement searchBox = driver.findElement(By.name("q"));
	      searchBox.sendKeys("ChromeDriver");
	      searchBox.submit();
	      //Thread.sleep(5000);  // Let the user actually see something!
	      driver.quit();
*/


	}

}
