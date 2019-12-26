package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Home;
import page.objects.PetStoreMeny;
import page.objects.UbacivanejStavkiUKorpu;

public class TestUbacivanjeUKorpu {


	public static void wait1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void UbacivanjeUKorpu() {

		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://petstore.octoperf.com/";
		driver.get(URL);

		driver.manage().window().maximize();
		Home.clickEnterButton(driver);

		PetStoreMeny.clickFISH(driver);
		UbacivanejStavkiUKorpu.getFISHch(driver);
		UbacivanejStavkiUKorpu.clickFISHch(driver);
		wait1();
		UbacivanejStavkiUKorpu.getFISHED(driver);
		UbacivanejStavkiUKorpu.clickFISHED(driver);

		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMeny.clickREPTILS(driver);
		UbacivanejStavkiUKorpu.getREPTch(driver);
		UbacivanejStavkiUKorpu.clickREPTch(driver);
		wait1();
		UbacivanejStavkiUKorpu.getREPTILSED(driver);
		UbacivanejStavkiUKorpu.clickREPTILSED(driver);

		SoftAssert sa = new SoftAssert();
		sa.assertAll();
		wait1();
        driver.close();
	}

}
