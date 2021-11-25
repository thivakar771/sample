package org.junisample;

import java.util.Date;

import org.ex.Baseclass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.FbLogIn;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Juni extends Baseclass {

	@BeforeClass
	public static void driv() {
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
	}

	@Before
	public void progStartDate() {
		Date d = new Date();

		System.out.println(d);

	}

	@After
	public void progEndDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void End() {
		driver.quit();
	}
    @Ignore
	@Test
	public void tc1() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test
	public void tc2() {
		FbLogIn lp = new FbLogIn();
		WebElement em = lp.getTxtEmail();
		enterUserName(em, "9500632981");
		String usName = em.getAttribute("value");
		Assert.assertTrue("\n username checking",usName.contains("50063"));
		WebElement pass = lp.getTxtPass();
		String ps = pass.getAttribute("value");
		Assert.assertEquals("\n password field checking", "Vairamuth", "Vairamuthu");
		enterPass(pass, "Vairamuthu");
		WebElement log = lp.getBtnLogin();
		logIn(log);
	}

	@Test
	public void tc3() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("\n url check", currentUrl.endsWith(".com/"));
		System.out.println(currentUrl);
	}

}
