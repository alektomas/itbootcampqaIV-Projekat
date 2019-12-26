package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMeny {

	public static final String URL = "https://petstore.octoperf.com/";
	private static final String FISH = "//div[@id='Content']//a[1]//img[1]";
	private static final String DOGS = "//div[@id='Content']//a[2]//img[1]";
	private static final String CATS = "//div[@id='Content']//a[3]//img[1]";
	private static final String REPTILS = "//div[@id='Content']//a[4]//img[1]";
	private static final String BIRDS = "//div[@id='Content']//a[5]//img[1]";

	private static final String FISHUp = "/html[1]/body[1]/div[1]/div[4]/a[1]/img[1]";
	private static final String DOGSUp = "/html[1]/body[1]/div[1]/div[4]/a[2]/img[1]";
	private static final String CATSUp = "/html[1]/body[1]/div[1]/div[4]/a[4]/img[1]";
	private static final String REPTILSUp = "/html[1]/body[1]/div[1]/div[4]/a[3]/img[1]";
	private static final String BIRDSUp = "/html[1]/body[1]/div[1]/div[4]/a[5]/img[1]";

	private static final String FISHImg = "//body//area[2]";
	private static final String DOGSImg = "//body//area[3]";
	private static final String CATSImg = "//body//area[5]";
	private static final String REPTILSImg = "//body//area[4]";
	private static final String BIRDSImg = "//body//area[6]";
	private static final String CBIRDSImg = "//body//area[1]";
	private static final String Search= "//input[@name='keyword']";
	private static final String Search_bat= "//input[@name='searchProducts']";

	private static final String SingIn = "//a[contains(text(),'Sign In')]";

	public static WebElement getFISH(WebDriver driver) {
		return driver.findElement(By.xpath(FISH));
	}

	public static void clickFISH(WebDriver driver) {
		getFISH(driver).click();
	}

	public static WebElement getDOGS(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS));
	}

	public static void clickDOGS(WebDriver driver) {
		getDOGS(driver).click();
	}

	public static WebElement getCATS(WebDriver driver) {
		return driver.findElement(By.xpath(CATS));
	}

	public static void clickCATS(WebDriver driver) {
		getCATS(driver).click();
	}

	public static WebElement getREPTILS(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILS));
	}

	public static void clickREPTILS(WebDriver driver) {
		getREPTILS(driver).click();
	}

	public static WebElement getBIRDS(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS));
	}

	public static void clickBIRDS(WebDriver driver) {
		getBIRDS(driver).click();

	}

	public static WebElement getFISHUp(WebDriver driver) {
		return driver.findElement(By.xpath(FISHUp));
	}

	public static void clickFISHUp(WebDriver driver) {
		getFISHUp(driver).click();
	}

	public static WebElement getDOGSUp(WebDriver driver) {
		return driver.findElement(By.xpath(DOGSUp));
	}

	public static void clickDOGSUp(WebDriver driver) {
		getDOGSUp(driver).click();
	}

	public static WebElement getCATSUp(WebDriver driver) {
		return driver.findElement(By.xpath(CATSUp));
	}

	public static void clickCATSUp(WebDriver driver) {
		getCATSUp(driver).click();
	}

	public static WebElement getREPTILSUp(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILSUp));
	}

	public static void clickREPTILSUp(WebDriver driver) {
		getREPTILSUp(driver).click();
	}

	public static WebElement getBIRDSUp(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDSUp));
	}

	public static void clickBIRDSUp(WebDriver driver) {
		getBIRDSUp(driver).click();
	}

	public static WebElement getFISHImg(WebDriver driver) {
		return driver.findElement(By.xpath(FISHImg));
	}

	public static void clickFISHImg(WebDriver driver) {
		getFISHImg(driver).click();
	}

	public static WebElement getDOGSImg(WebDriver driver) {
		return driver.findElement(By.xpath(DOGSImg));
	}

	public static void clickDOGSImg(WebDriver driver) {
		getDOGSImg(driver).click();
	}

	public static WebElement getCATSImg(WebDriver driver) {
		return driver.findElement(By.xpath(CATSImg));
	}

	public static void clickCATSImg(WebDriver driver) {
		getCATSImg(driver).click();
	}

	public static WebElement getREPTILSImg(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILSImg));
	}

	public static void clickREPTILSImg(WebDriver driver) {
		getREPTILSImg(driver).click();
	}

	public static WebElement getBIRDSImg(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDSImg));
	}

	public static void clickBIRDSImg(WebDriver driver) {
		getBIRDSImg(driver).click();

	}

	public static WebElement getSBIRDSImg(WebDriver driver) {
		return driver.findElement(By.xpath(CBIRDSImg));
	}

	public static void clickSBIRDSImg(WebDriver driver) {
		getSBIRDSImg(driver).click();

	}

	public static WebElement getSingIn(WebDriver driver) {
		return driver.findElement(By.xpath(SingIn));
	}

	public static void clickSingIn(WebDriver driver) {
		getSingIn(driver).click();
	}
	
	public static WebElement getSearch(WebDriver driver) {
		return driver.findElement(By.xpath(Search));
	}

	public static void clickSearch(WebDriver driver) {
		getSearch(driver).click();
	}
		
		public static void inputSearch(WebDriver driver, String data) {
			getSearch(driver).sendKeys(data);
}
	public static WebElement getSearchBat(WebDriver driver) {
		return driver.findElement(By.xpath(Search_bat));
	}

	public static void clickSearchBat(WebDriver driver) {
		getSearchBat(driver).click();
		
		
	}
	
}