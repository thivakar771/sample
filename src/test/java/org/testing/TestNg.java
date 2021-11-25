package org.testing;

import org.ex.Baseclass;
import org.pojo.FbLogIn;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg extends Baseclass {
	
	// @BeforeClass
	// private void la() {
	// browserLaunch();
	// urlLoad("https://en-gb.facebook.com/");
	// browserMax();
	// }
	//
	// @BeforeMethod
	// private void date() {
	// forGetDateTime();
	//
	// }

	@Test
	private void fbLog() {
		// getCurrentUrl();
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "950063291");
		enterPass(l.getTxtPass(),"Vairamuth");
		logIn(l.getBtnLogin());
		quitpage();
	}

	@Test
	private void fbLog1() {
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "vairamuthu");
		enterPass(l.getTxtPass(), "767678237");
		logIn(l.getBtnLogin());
		quitpage();

	}

	@Test(enabled = false)
	private void fbLog3() {
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "67777777");
		enterPass(l.getTxtPass(), "vasanth");
		logIn(l.getBtnLogin());
		quitpage();

	}

	@Test(priority = 3)
	private void fbLog2() {
		
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "67777777");
		enterPass(l.getTxtPass(), "divakar");
		logIn(l.getBtnLogin());
		quitpage();

	}

	@Test(priority = -3,invocationCount = 6)
	private void fbLogg() {
		// tittleGet();
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "67777777");
		enterPass(l.getTxtPass(), "rrr");
		logIn(l.getBtnLogin());
		quitpage();
	}

	// @AfterMethod
	// private void date1() {
	// forGetDateTime();
	//
	// }
	// @AfterClass
	// private void exit() {
	// quitpage();
	//
	// }

}
