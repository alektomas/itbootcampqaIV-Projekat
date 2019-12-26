package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utils.ExcelUtils;
import page.objects.Home;
import page.objects.Registration;
import page.objects.SingIn;

public class TestReg {

	public static void wait1() {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void Registration() {

		System.setProperty("webdriver.chrome.driver", "src\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String DATA_SOURCE = "UserRandomData.xlsx";

		driver.get(Home.URL);

		driver.manage().window().maximize();

		Home.clickEnterButton(driver);
		wait1();

		SingIn.openRegLink(driver);
		wait1();
		SingIn.clickRegButt(driver);
		wait1();
		try {
			ExcelUtils.setExcell(DATA_SOURCE);
			ExcelUtils.setWorkSheet(0);
			wait1();
			for (int i = 1; i < 51; i++) {
				String Id, password, name, surname, phone, address1, address2, city, state, zip, country, email;
				Id = ExcelUtils.getDataAt(i, 0);
				password = ExcelUtils.getDataAt(i, 1);
				name = ExcelUtils.getDataAt(i, 2);
				surname = ExcelUtils.getDataAt(i, 3);
				email = ExcelUtils.getDataAt(i, 4);
				phone = ExcelUtils.getDataAt(i, 5);
				address1 = ExcelUtils.getDataAt(i, 6);
				address2 = ExcelUtils.getDataAt(i, 7);
				city = ExcelUtils.getDataAt(i, 8);
				state = ExcelUtils.getDataAt(i, 9);
				zip = ExcelUtils.getDataAt(i, 10);
				country = ExcelUtils.getDataAt(i, 11);
				System.out.println(Id);

				Registration.clickID(driver);
				Registration.inputID(driver, Id);
				wait1();
				Registration.clickPass(driver);
				Registration.inputPass(driver, password);
				wait1();
				Registration.clickRpass(driver);
				Registration.inputRpass(driver, password);
				wait1();
				Registration.clickName(driver);
				Registration.inputName(driver, name);
				wait1();
				Registration.clickLName(driver);
				Registration.inputLName(driver, surname);
				wait1();
				Registration.clickEmail(driver);
				Registration.inputEmail(driver, email);
				wait1();
				Registration.clickPhone(driver);
				Registration.inputPhone(driver, phone);
				wait1();
				Registration.clickAddress1(driver);
				Registration.inputAddress1(driver, address1);
				wait1();
				Registration.clickAddress2(driver);
				Registration.inputAddress2(driver, address2);
				wait1();
				Registration.clickCity(driver);
				Registration.inputCity(driver, city);
				wait1();
				Registration.clickState(driver);
				Registration.inputState(driver, state);
				wait1();
				Registration.clickZip(driver);
				Registration.inputZip(driver, zip);
				wait1();
				Registration.clickCountry(driver);
				Registration.inputCountry(driver, country);
				wait1();
				Registration.getLenguagePr(driver);
				Registration.inputLenguagePr(driver, "japanese");
				wait1();
				Registration.inputCategory(driver, "DOGS");
				Registration.clickMyBanner(driver);
				wait1();
				Registration.clickMyList(driver);
				Registration.clickSaAccount(driver);
				wait1();
				SingIn.openRegLink(driver);
				wait1();
				SingIn.clickRegButt(driver);
				wait1();

				SoftAssert sa = new SoftAssert();
				sa.assertAll();

			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske");

		} finally {

		}
	}
}