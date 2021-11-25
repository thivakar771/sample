package org.ex;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.security.auth.DestroyFailedException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert alert;
	public static TakesScreenshot tk;
	public static File src;
	public static File des;
	public static JavascriptExecutor jrs;
	public static String ss;
	public static Select s;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void urlLoad(String url) {

		driver.get(url);

	}

	public static void browserMax() {
		driver.manage().window().maximize();

	}

	public static void tittleGet() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void quitpage() {
		driver.quit();
	}

	public static void enterUserName(WebElement element, String userText) {
		element.sendKeys(userText);

	}

	public static void enterPass(WebElement element1, String passText) {
		element1.sendKeys(passText);

	}

	public static void logIn(WebElement element2) {
		element2.click();

	}

	public static void getText(WebElement text) {
		String text2 = text.getText();
		System.out.println(text2);

	}

	static String sendtext = " ";

	public static String getAtt(WebElement attri) {

		sendtext = attri.getAttribute("value");
		System.out.println(sendtext);
		return sendtext;
	}

	public static void forDoMoveToElement(WebElement element3) {
		a = new Actions(driver);
		a.moveToElement(element3).perform();

	}

	public static void forDragAndDrop(WebElement source, WebElement des) {
		a.dragAndDrop(source, des).perform();
	}

	public static void forDoubleClick(WebElement cl) {
		a.doubleClick(cl).perform();
	}

	private void forContextClick(WebElement right) {
		a.contextClick(right).perform();
	}

	public static void forKeyDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void switchAlert() {
		alert = driver.switchTo().alert();
	}

	public static void alertText() {
		String text = alert.getText();
		System.out.println(text);
	}

	public static void acceptAlerts() {
		alert.accept();
	}

	public static void dismissAlert() {
		alert.dismiss();
	}

	public static void sendValue() {
		alert.sendKeys("vairamuthu");
	}

	public static void pageScreenshot(WebElement element) {
		tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);

	}

	public static void store() throws IOException {
		des = new File("");
		FileUtils.copyFile(src, des);
	}

	public static void scrollDownThePage(WebElement web) {
		jrs = (JavascriptExecutor) driver;
		jrs.executeScript("arguments[0].scrollIntoView(true)", web);

	}

	public static void scrollUpThePage(WebElement up) {
		jrs.executeScript("aruguments[0].scrollIntoView(false)", up);
	}

	public static void sendVal(WebElement el, Object user) {
		jrs.executeScript("arugumets[0].setAttribute('value','user')", el);

	}

	public static void getVal(WebElement get, Object print, String ss) {
		jrs.executeScript("returnarguments[0].getAttribute('value')", get);
		ss = (String) print;
		System.out.println(ss);
	}

	public static void clickval(WebElement cl) {
		jrs.executeScript("aruguments[0].click()", cl);
	}

	public static void switchFrameforWebElIn() {
		driver.switchTo().frame(1);

	}

	public static void switchFrameforWebElId() {
		driver.switchTo().frame("name");
	}

	private static void switchFrameforWebElRef(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public static void switchInToOut() {
		driver.switchTo().parentFrame();
	}

	public static void switchMainHtml() {
		driver.switchTo().defaultContent();
	}

	public static void windowHandle() {
		String parentid = driver.getWindowHandle();
		Set<String> eachId = driver.getWindowHandles();
		for (String id : eachId) {
			if (!id.equals(parentid)) {
				driver.switchTo().window(id);
			}
		}

	}

	public static void windowHandle1() {
		Set<String> eachid = driver.getWindowHandles();

		List<String> ids = new ArrayList<String>();
		ids.addAll(eachid);
		driver.switchTo().window(ids.get(1));

	}

	public static void windowHandleClToPr() {
		driver.switchTo().defaultContent();
	}

	public static void selectOptions(WebElement rr) {
		s = new Select(rr);
	}

	public static void selectUseVisibleTxt() {
		s.selectByVisibleText("orange");
	}

	public static void selectUseVal() {
		s.selectByValue("orange");
	}

	public static void selectUseIndex() {
		s.selectByIndex(0);
	}

	public static void deselect() {
		s.deselectAll();
	}

	public static void deselectIn() {
		s.deselectByIndex(0);
	}

	public static void deselectVt() {
		s.deselectByVisibleText("orange");
	}

	public static void deselectVl() {
		s.deselectByValue("orange");
	}

	public static void getOp() {
		List<WebElement> options = s.getOptions();
		for (WebElement allOp : options) {
			System.out.println(allOp.getText());
		}
	}

	public static void get1stSelOp() {
		WebElement option = s.getFirstSelectedOption();
		System.out.println(option.getText());
	}

	public static void allOp() {
		List<WebElement> options = s.getAllSelectedOptions();

		for (WebElement webEl : options) {
			System.out.println(webEl.getText());
		}

	}

	public static void implWait() {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public static void webDriWait(WebElement fr) {
		WebDriverWait wdw = new WebDriverWait(driver,6);
		wdw.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		wdw.until(ExpectedConditions.alertIsPresent());
		wdw.until(ExpectedConditions.elementToBeSelected(fr));
		wdw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframe")));
		
		
	}

	// for excelread

	public static String excelRead(String shName, int rowNo, int cellNo) throws Throwable {

		File f = new File("C:\\Users\\vairamuthu\\eclipse-workspace\\Sample\\worksheet\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheet(shName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cType = c.getCellType();

		String name = " ";

		if (cType == 1) {
			name = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd,mmm,yyyy");
			name = s.format(dd);

		} else {
			double ncv = c.getNumericCellValue();
			long jj = (long) ncv;
			name = String.valueOf(jj);
		}
		return name;

	}

	public void forGetDateTime() {
		Date d = new Date();
		System.out.println(d);
	}

}