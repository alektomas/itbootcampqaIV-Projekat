package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	
	public static final String URL="https://petstore.octoperf.com/";
	private static final String ENTER_THE_STORE_BUTTON_XPATH="//a[contains(text(),'Enter the Store')]";
	private static final String TITLE="/html[1]/body[1]/div[1]/h2[1]]";
	public static WebElement getEnterButton(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_STORE_BUTTON_XPATH));
	}
	public static void clickEnterButton(WebDriver driver) {
	getEnterButton(driver).click();
	}
	public static WebElement getTitle(WebDriver driver) {
		return driver.findElement(By.xpath(TITLE));
	}

}
