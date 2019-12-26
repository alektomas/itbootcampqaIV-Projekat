package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UbacivanejStavkiUKorpu {

	private static final String FISHCH = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]";
	private static final String DOGSCH = "//a[contains(text(),'K9-PO-02')]";
	private static final String CATSCH = "//a[contains(text(),'EST-14')]";
	private static final String REPTILSCH = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]";
	private static final String BIRDSCH = "//a[contains(text(),'AV-CB-01')]";
	
	
	private static final String FISHED = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]";
	private static final String REPTILSED = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]";
	
	
	public static WebElement getFISHch(WebDriver driver) {
		return driver.findElement(By.xpath(FISHCH));
	}

	public static void clickFISHch(WebDriver driver) {
		getFISHch(driver).click();
	}

	public static WebElement getDOGch(WebDriver driver) {
		return driver.findElement(By.xpath(DOGSCH));
	}

	public static void clickDOGch(WebDriver driver) {
		getDOGch(driver).click();
	}

	public static WebElement getCATch(WebDriver driver) {
		return driver.findElement(By.xpath(CATSCH));
	}

	public static void clickCATch(WebDriver driver) {
		getCATch(driver).click();

	}

	public static WebElement getBIRDch(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDSCH));
	}

	public static void clickBIRDch(WebDriver driver) {
		getBIRDch(driver).click();
	}
	
	public static WebElement getREPTch(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILSCH ));
	}

	public static void clickREPTch(WebDriver driver) {
		getREPTch(driver).click();
	}
	
	
	public static WebElement getFISHED(WebDriver driver) {
		return driver.findElement(By.xpath(FISHED ));
	}

	public static void clickFISHED(WebDriver driver) {
		getFISHED(driver).click();
	}
	
	public static WebElement getREPTILSED(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILSED ));
	}

	public static void clickREPTILSED(WebDriver driver) {
		getREPTILSED(driver).click();
	}


}