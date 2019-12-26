package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingIn {

	// public static void clickSingIn(WebDriver driver) {
	// PetStoreMeny.getSingIn(driver).click();
	// }
	public static final String RegLink = "https://petstore.octoperf.com/actions/Account.action";
	private static final String UserName = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String Password = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	private static final String Login = "//input[@name='signon']";
	private static final String RegButton = "//a[contains(text(),'Register Now!')]";

	private static final String MyAccount = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";
	private static final String SingOut = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";

	public static void openRegLink(WebDriver driver) {

		driver.get(RegLink);
	}

	public static void navigateToRegLink(WebDriver driver) {

		driver.navigate().to(RegLink);
	}

	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(UserName));
	}

	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(Password));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();

	}

	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(Login));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();

	}

	public static WebElement getRegButt(WebDriver driver) {
		return driver.findElement(By.xpath(RegButton));
	}

	public static void clickRegButt(WebDriver driver) {
		getRegButt(driver).click();
	}

	public static WebElement getMyAcc(WebDriver driver) {
		return driver.findElement(By.xpath(MyAccount));
	}

	public static void clickMyAcc(WebDriver driver) {
		getMyAcc(driver).click();

	}

	public static WebElement getSingOut(WebDriver driver) {
		return driver.findElement(By.xpath(SingOut));
	}

	public static void clickSingOut(WebDriver driver) {
		getSingOut(driver).click();
	}
}