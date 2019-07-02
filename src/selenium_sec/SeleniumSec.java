package selenium_sec;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumSec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("gagagaDD");







		System.setProperty("webdriver.firefox.profile", "default-release");




		//File profileDir = new File(path);
		//FirefoxProfile profile = new FirefoxProfile(profileDir);
		//WebDriver driver = new FirefoxDriver(profile);


	      System.setProperty("webdriver.gecko.driver", "./exe/geckodriver.exe");
	      DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setCapability("marionette", true);

			String profileDir = "C:\\Users\\kouji\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\msf4k3yi.kouji";

			FirefoxProfile fp = new FirefoxProfile(new File(profileDir));
			cap.setCapability(FirefoxDriver.PROFILE, fp);


			WebDriver driver = new FirefoxDriver(cap);
			driver.navigate().to("about:addons");
			//driver.findElement(By.id("lst-ib")).sendKeys("Selenium3");
			//driver.findElement(By.name("btnK")).click();
			//if(driver!=null) {
				//driver.close();
			//}





/*
 *
 		  	      //System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
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
