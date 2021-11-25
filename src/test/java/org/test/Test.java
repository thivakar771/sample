package org.test;

import org.ex.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test extends Baseclass {

	public static void main(String[] args) {
		browserLaunch();
		urlLoad("https://en-gb.facebook.com/");
		browserMax();
		tittleGet();
		getCurrentUrl();
		
		WebElement emailId = driver.findElement(By.id("email"));
		
		enterUserName(emailId, "9500632981");
		
		WebElement pass = driver.findElement(By.id("pass"));
		enterPass(pass, "vairamuthu");
		
		WebElement login = driver.findElement(By.name("login"));
		logIn(login);
		
		selectOptions(login);
		selectUseIndex();
	}

}