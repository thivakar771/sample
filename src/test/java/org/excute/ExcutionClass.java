package org.excute;

import org.ex.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcutionClass extends Baseclass {
public static void main(String[] args) throws Throwable {

	browserLaunch();
	urlLoad("https://en-gb.facebook.com/");
	browserMax();
	
	driver.findElement(By.id("email")).sendKeys(excelRead("TASK", 2, 1));
	driver.findElement(By.id("pass")).sendKeys(excelRead("TASK", 3, 2));
	

}
}

