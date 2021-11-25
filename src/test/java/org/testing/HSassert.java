package org.testing;

import org.ex.Baseclass;
import org.pojo.FbLogIn;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HSassert extends Baseclass {
	@Test
	private void fbLog() {
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "950063291");
		//hardassert-asserttrue
			String user = getAtt(l.getTxtEmail());
			Assert.assertTrue(user.equals("964466666"), "\nusernamecheck");
			//assertequal
		enterPass(l.getTxtPass(),"Vairamuthu");
		String pass = getAtt(l.getTxtPass());
		Assert.assertEquals(pass, "Vairamuthu");
		
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
		String user1 = getAtt(l.getTxtEmail());
		//softassert-assertequal
		SoftAssert s = new SoftAssert();
		s.assertEquals(user1, "vairamuth");

		enterPass(l.getTxtPass(), "Divakar");
		String pass1 = getAtt(l.getTxtPass());
		//aserttrue
		s.assertTrue(pass1.equalsIgnoreCase("divakar"));

		logIn(l.getBtnLogin());
		quitpage();
		s.assertAll();

	}

	@Test
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

	@Test
	private void fbLog2() {
		
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		FbLogIn l = new FbLogIn();
		enterUserName(l.getTxtEmail(), "67777777");
		String user2 = l.getTxtEmail().getAttribute("value");
		Assert.assertEquals(user2, "67777677");
		enterPass(l.getTxtPass(), "divakar");
		logIn(l.getBtnLogin());
		quitpage();

	}

	@Test
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
}
