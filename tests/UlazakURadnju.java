package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Home;

public class UlazakURadnju {

	public static void wait1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Radnja() {

		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL = "https://petstore.octoperf.com/";
		driver.get(URL);

		driver.manage().window().maximize();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), URL);
		sa.assertAll();
		Home.clickEnterButton(driver);
		wait1();
		driver.close();
	}

}
