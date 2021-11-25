package org.pojo;

import org.ex.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLogIn extends Baseclass {

	public FbLogIn() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;
	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindAll({ @FindBy(xpath = "//button[@name='login']"), @FindBy(xpath = "//button[@type='submi']")

	})
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
