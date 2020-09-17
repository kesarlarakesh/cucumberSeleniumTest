package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;

	public static String browserName = ReadProperyFile.getConfigData("browser");
	public static String chromedriverpath = ReadProperyFile.getConfigData("chromebrowserpath");

	/* This Method is used to do browser setup */
	public static WebDriver driverSetup() {
		try {
			switch (browserName) {
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromedriverpath);
				driver = new ChromeDriver();
				break;
			default:
				System.out.println("No browser is defined");
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	/* This Method is used to validate whether element is visible */
	public static boolean isWebElementVisible(WebElement element) {
		boolean isElementDisplayed = false;
		isElementDisplayed = element.isEnabled();
		return isElementDisplayed;
	}
}
