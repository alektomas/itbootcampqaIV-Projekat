package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static final String URL = "https://petstore.octoperf.com/";

	private static final String USER_ID = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String NEW_PASSWORD = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String REPEATE_PASSWORD = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";

	private static final String FIRST_NAME = "//input[@name='account.firstName']";
	private static final String LAST_NAME = "//input[@name='account.lastName']";
	private static final String EMALI = "//input[@name='account.email']";
	private static final String PHONE = "//input[@name='account.phone']";
	private static final String ADDRESS = "//input[@name='account.address1']";
	private static final String ADDRESS2 = "//input[@name='account.address2']";
	private static final String CITY = "//input[@name='account.city']";
	private static final String STATE = "//input[@name='account.state']";
	private static final String ZIP = "//input[@name='account.zip']";
	private static final String COUNTRY = "//input[@name='account.country']";

	private static final String LENGUAGE = "//select[@name='account.languagePreference']";
	private static final String FAVOURITE_CATEGORY = "//select[@name='account.favouriteCategoryId']";
	private static final String ENABLE_MY_LIST = "//input[@name='account.listOption']";
	private static final String ENABLE_MY_BANNER = "//input[@name='account.bannerOption']";

	private static final String SAVE_ACCOUNT_INFORMATION = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";

	/// USER ID
	public static WebElement getID(WebDriver driver) {
		return driver.findElement(By.xpath(USER_ID));
	}

	public static void clickID(WebDriver driver) {
		getID(driver).clear();
		getID(driver).click();
	}

	public static void inputID(WebDriver driver, String data) {
		getID(driver).sendKeys(data);
	}

	/// NEW PASSWORD
	public static WebElement getPass(WebDriver driver) {
		return driver.findElement(By.xpath(NEW_PASSWORD));
	}

	public static void clickPass(WebDriver driver) {
		getPass(driver).clear();
		getPass(driver).click();
	}

	public static void inputPass(WebDriver driver, String data) {
		getPass(driver).sendKeys(data);
	}

	/// REPEATE PASSWORD
	public static WebElement getRpass(WebDriver driver) {
		return driver.findElement(By.xpath(REPEATE_PASSWORD));
	}

	public static void clickRpass(WebDriver driver) {
		getRpass(driver).clear();
		getRpass(driver).click();
	}

	public static void inputRpass(WebDriver driver, String data) {
		getRpass(driver).sendKeys(data);
	}

	/// FIRST NAME
	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME));
	}

	public static void clickName(WebDriver driver) {
		getName(driver).clear();
		getName(driver).click();
	}

	public static void inputName(WebDriver driver, String data) {
		getName(driver).sendKeys(data);
	}

	/// LAST NAME
	public static WebElement getLName(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME));
	}

	public static void clickLName(WebDriver driver) {
		getLName(driver).clear();
		getLName(driver).click();
	}

	public static void inputLName(WebDriver driver, String data) {
		getLName(driver).sendKeys(data);
	}

	/// EMAIL
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMALI));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).clear();
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	/// PHONE
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(PHONE));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).clear();
		getPhone(driver).click();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).sendKeys(data);
	}

	/// ADDRESS
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS));
	}

	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).clear();
		getAddress1(driver).click();
	}

	public static void inputAddress1(WebDriver driver, String data) {
		getAddress1(driver).sendKeys(data);
	}

	/// ADDRESS2
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS2));
	}

	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).clear();
		getAddress2(driver).click();
	}

	public static void inputAddress2(WebDriver driver, String data) {
		getAddress2(driver).sendKeys(data);
	}

	/// CITY
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(CITY));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).clear();
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	/// STATE
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ZIP));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).clear();
		getZip(driver).click();
	}

	public static void inputZip(WebDriver driver, String data) {
		getZip(driver).sendKeys(data);
	}

	/// ZIP
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(STATE));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).clear();
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	/// COUNTRY
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).clear();
		getCountry(driver).click();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).sendKeys(data);
	}

	/// LENGUAGE
	public static Select getLenguagePr(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LENGUAGE)));
	}

	public static void inputLenguagePr(WebDriver driver, String data) {
		getLenguagePr(driver).selectByVisibleText(data);
	}

	/// FAVOURITE_CATEGORY
	public static Select getCategory(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(FAVOURITE_CATEGORY)));
	}

	public static void inputCategory(WebDriver driver, String data) {
		getCategory(driver).selectByVisibleText(data);
	}

	/// ENABLE_MY_LIST
	public static WebElement getMyList(WebDriver driver) {
		return driver.findElement(By.xpath(ENABLE_MY_LIST));
	}

	public static void clickMyList(WebDriver driver) {
		getMyList(driver).click();

	}

	public static WebElement getMyBanner(WebDriver driver) {
		return driver.findElement(By.xpath(ENABLE_MY_BANNER));
	}

	public static void clickMyBanner(WebDriver driver) {
		getMyBanner(driver).click();
	}

	/// SAVE_ACCOUNT_INFORMATION
	public static WebElement getSaAccount(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_ACCOUNT_INFORMATION));
	}

	public static void clickSaAccount(WebDriver driver) {
		getSaAccount(driver).click();
	}

}
