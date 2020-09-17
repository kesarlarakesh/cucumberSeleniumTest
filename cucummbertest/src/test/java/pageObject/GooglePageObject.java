package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.ReadProperyFile;
import helper.TestBase;

public class GooglePageObject {

	public WebDriver driver;

	public GooglePageObject() {
		driver = TestBase.driverSetup();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchBox;

	@FindBy(xpath = "//a[@href='https://www.jpmorgan.com/']")
	private WebElement LinkClick;

	@FindBy(xpath = "//div[@class='logo-desktop-only']//div[@class='logo container-fluid']")
	private WebElement jpMorganLogo;
	
	By verifyImage = By.xpath("//div[@class='logo-desktop-only']//div[@class='logo container-fluid']");

	/* This Method is used to launch the application URL */
	public void launchURL() {
		String baseURL = ReadProperyFile.getConfigData("GoogleURL");
		String env = ReadProperyFile.getConfigData("environment");
		if (env.equalsIgnoreCase("INT")) {
			// provide URL for INT environment
		} else if (env.equalsIgnoreCase("STAG")) {
			// provide URL for STAG environment
		} else if (env.equalsIgnoreCase("QA")) {
			System.out.println(baseURL);
			driver.get(baseURL);
			driver.manage().window().maximize();
			int wait = Integer.parseInt(ReadProperyFile.getConfigData("implicitwait"));
			driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
			int pageloadTime = Integer.parseInt(ReadProperyFile.getConfigData("pageloadTimeout"));
			driver.manage().timeouts().pageLoadTimeout(pageloadTime, TimeUnit.SECONDS);
		}
	}

	/* This Method is used to verify page title*/
	public String verifyHomepage() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	/* This Method is used to provide the search data */
	public void provideSearchInput(String strSearchData) {
		searchBox.sendKeys(strSearchData);
		searchBox.sendKeys(Keys.ENTER);
	}

	/* This Method is used to click link on the result page */
	public void clickOnLink() {
		LinkClick.click();
		WebDriverWait wait = new WebDriverWait(driver,
				Integer.parseInt(ReadProperyFile.getConfigData("pageloadTimeout")));
		wait.until(ExpectedConditions.presenceOfElementLocated(verifyImage));
	}

	/* This Method is used to verify logo on the page */
	public boolean verifyLogo() {
		return TestBase.isWebElementVisible(jpMorganLogo);
	}
	
}
