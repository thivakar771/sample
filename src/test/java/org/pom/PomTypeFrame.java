package org.pom;

import org.ex.Baseclass;
import org.openqa.selenium.WebElement;
import org.pojo.FbLogIn;

public class PomTypeFrame extends Baseclass {
public static void main(String[] args) {
	
	browserLaunch();
	urlLoad("https://en-gb.facebook.com/");
	browserMax();
	
	FbLogIn fb = new FbLogIn();
	
	WebElement userId = fb.getTxtEmail();
	enterUserName(userId, "9500632981");
	
	WebElement Pass = fb.getTxtPass();
	enterPass(Pass, "vairamuthu");
	
	WebElement login = fb.getBtnLogin();
	logIn(login);
}
}
