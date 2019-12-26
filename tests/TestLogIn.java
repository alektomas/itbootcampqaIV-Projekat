package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Home;
import page.objects.PetStoreMeny;

import page.objects.SingIn;

public class TestLogIn {

	public static void wait1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Login() {

		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://petstore.octoperf.com/";
		driver.get(URL);

		driver.manage().window().maximize();
		Home.clickEnterButton(driver);
		PetStoreMeny.clickSingIn(driver);
		wait1();
		SingIn.clickUserName(driver);
		wait1();
		SingIn.getUserName(driver).sendKeys("1AC");
		wait1();
		SingIn.clickPassword(driver);
		wait1();
		SingIn.getPassword(driver).clear();
		SingIn.getPassword(driver).sendKeys("QsukPSnF");
		wait1();
		SingIn.clickLogin(driver);
		wait1();
		SingIn.getSingOut(driver);
		SingIn.clickSingOut(driver);

		SoftAssert sa = new SoftAssert();
		sa.assertAll();
        driver.close();
	}
}
