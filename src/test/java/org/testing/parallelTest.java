package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest {
	public static WebDriver driver;

	@Parameters({ "browser" })
	@Test
	private void facebook(String browsName) {
		if (browsName.endsWith("me")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

	}
}
