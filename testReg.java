
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ExcelUtils;
import page.objects.Home;
import page.objects.Registration;
import page.objects.SingIn;

public class testReg {

	public static void wait1() {
		  
		  try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	

	public static void main(String[] args) {
		
	
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
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		wait1();
		for (int i = 1; i < 2; i++) {
			String Id, password, name, surname, phone, address1, address2, city, state, zip ,country,email;
			Id = ExcelUtils.getDataAt(i, 0);
			password = ExcelUtils.getDataAt(i, 1);
			name= ExcelUtils.getDataAt(i, 2);
			surname = ExcelUtils.getDataAt(i, 3);
			email =ExcelUtils.getDataAt(i, 4);
			phone = ExcelUtils.getDataAt(i, 5);
			address1 = ExcelUtils.getDataAt(i, 6);
			address2 = ExcelUtils.getDataAt(i, 7);
			city = ExcelUtils.getDataAt(i, 8);
			state= ExcelUtils.getDataAt(i, 9);
			zip= ExcelUtils.getDataAt(i, 10);
			country = ExcelUtils.getDataAt(i, 11);
			System.out.println(Id);
			
			
            Registration.clickID(driver);
			Registration.inputID(driver, Id);
			Registration.inputPass(driver, password);
		    Registration.inputRpass(driver, password);
		    Registration.inputEmail(driver, email);
			Registration.inputName(driver, name);
			Registration.inputLName(driver, surname);
			Registration.inputPhone(driver, phone);
			Registration.inputAddress1(driver,address1);
			Registration.inputAddress2(driver, address2);
			Registration.inputCity(driver, city);
			Registration.inputState(driver, state);
			Registration.inputZip(driver, zip);
			Registration.inputCountry(driver, country);
			Registration.getLenguagePr(driver);
			Registration.inputLenguagePr(driver, "japanese");
			Registration.inputCategory(driver, "DOGS");
			Registration.clickMyBanner(driver);
			Registration.clickMyList(driver);
			
			
			
			
			
			
			Registration.clickSaAccount(driver);
			
			Home.clickEnterButton(driver);
			SingIn.clickLogin(driver);

}
}
}