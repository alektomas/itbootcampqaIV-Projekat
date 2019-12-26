
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.Home;
import page.objects.PetStoreMeny;

public class Test {

	public static void wait1() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://petstore.octoperf.com/";
		driver.get(URL);

		driver.manage().window().maximize();
		Home.clickEnterButton(driver);
		// Left Meny
		PetStoreMeny.clickFISH(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickBIRDS(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickCATS(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickDOGS(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		
		PetStoreMeny.clickREPTILS(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		// Up Meny

		PetStoreMeny.clickFISHUp(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickBIRDSUp(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		wait1();

		PetStoreMeny.clickCATSUp(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickDOGSUp(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickREPTILSUp(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		// Image Meny

		PetStoreMeny.clickFISHImg(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickBIRDSImg(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		wait1();

		PetStoreMeny.clickCATSImg(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickDOGSImg(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickREPTILSImg(driver);
		wait1();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		// Sing in

		PetStoreMeny.clickSingIn(driver);
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		
		// Search
		PetStoreMeny.clickSearch(driver);
		PetStoreMeny.inputSearch(driver, "FISH");
		PetStoreMeny.clickSearchBat(driver);
		
		String currURL = driver.getCurrentUrl();
		if (URL.equals(currURL)) {
			System.out.println("Otvorena je trazena stranica!");
		}
		else {
			System.out.println("Nije otvorena trazena stranica!");
			System.out.println("Trenutni url je " + currURL);
		} 
		
		
}}