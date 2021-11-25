package org.testing;

import org.ex.Baseclass;
import org.pojo.FbLogIn;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaSample extends Baseclass{
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
		 @Parameters({"sername","assword"})
		@Test
		private void fbLog(@Optional("9500632981")String email,@Optional("vairamuthu")String pass) {
			
			FbLogIn l = new FbLogIn();
			enterUserName(l.getTxtEmail(),email);
			enterPass(l.getTxtPass(),pass);
			logIn(l.getBtnLogin());
			quitpage();
		}


		 @AfterMethod
		 private void date1() {
		 forGetDateTime();
		
		 }
		 @AfterClass
		 private void exit() {
		 quitpage();
		
		 }

}
