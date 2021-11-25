package org.testing;

import org.ex.Baseclass;
import org.pojo.FbLogIn;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataPdr extends Baseclass{
	@BeforeClass
	 private void la() {
	 browserLaunch();
	 urlLoad("https://en-gb.facebook.com/");
	 browserMax();
	 }
	
	 @BeforeMethod
	 private void date() {
	 forGetDateTime();
	
	 }

	@Test(dataProvider="Testdata",dataProviderClass=DataPdr.class)
	private void fbLog(String email,String pass) throws InterruptedException {
	    urlLoad("https://en-gb.facebook.com/");
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(),email);
		enterPass(l.getTxtPass(),pass);
		logIn(l.getBtnLogin());
			Thread.sleep(3000);
	
	}
	@Test
	private void t1() {
		tittleGet();
	}
	@Test
	private void tc2() {
	getCurrentUrl();

	}


	 @AfterMethod
	 private void date1() {
	 forGetDateTime();
	
	 }
	 @AfterClass
	 private void exit() {
	 quitpage();
	
	 }
	 @DataProvider(name="Testdata")
	      private Object[][] Data() {
		  return new Object[][]{
		 
		  {"Vairamuthu","9500632981"},{"9500632981","divakar"},{"345374","Vairamuthu"},{"9500632981","Vairamuthu"}

		};

}
}
