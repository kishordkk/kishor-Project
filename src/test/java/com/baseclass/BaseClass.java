package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
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
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public String getdata(String sheetname,int rownum,int cellnum ) throws IOException {
		String res=null;
		File file=new File("C:\\Users\\S130\\eclipse-workspace\\Excel_Dropdown\\Excel\\Adactin.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType Type = cell.getCellType();
		
		switch (Type) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue =  cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mmm-yy");
				res = dateFormat.format(dateCellValue);

			} else {
				double d = cell.getNumericCellValue();
				BigDecimal b=BigDecimal.valueOf(d);
				res= b.toString();
			}
			break;

		default:
			break;
		}
		return res;
	}
	public void  updatedata(String sheetname,int rownum,int cellnum,String olddata,String newdata ) throws IOException {
		String res=null;
		File file=new File("C:\\Users\\S130\\eclipse-workspace\\Excel_Dropdown\\Excel\\Adactin.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value =	cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(newdata);
		}
		FileOutputStream Stream2 = new FileOutputStream(file);
		workbook.write(Stream2);

	}

	public void  writedata(String sheetname,int rownum,int cellnum,String data ) throws IOException {

		File file=new File("C:\\Users\\S130\\eclipse-workspace\\Excel_Dropdown\\Excel\\Adactin.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream Stream2 = new FileOutputStream(file);
		workbook.write(Stream2);

	}
	public void getdriver( ) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();			
	}
	public void loadurl(String url) {

		driver.get(url);
	}
	public void maximize() {

		driver.manage().window().maximize();
	}
	public void Type(WebElement element,String data) {

		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	public WebElement findelementid(String attributevalue) {		
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}
	public WebElement findelementname(String attributevalue) {		
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}
	public WebElement findelementclassname(String attributevalue) {		
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}
	public WebElement findelementxpath(String xpath) {		
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
//	public void implicwait() {
//		 driver.
//		
//	}
	public String geturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String gettext(WebElement element) {
		String gettext = element.getText();
		return gettext;
	}
	//99% attribute value
	public String getAttribute1(WebElement element,String value) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	//1%attribute value
	public String getAttribute(WebElement element,String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}
	public void Selectbyoptiontext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);	
	}
	public void Selectbyoptionbyvalue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void Selectbyoptionbyindex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void typejs(WebElement element,String data) {

		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].set attribute('value'),'"+data+"')", element);

	}
	public void Getattributejs(WebElement element) {

		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("return arguments[0].get attribute('value')", element);
	}
	public void Scrolldownupjs(WebElement element) {

		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].ScrollIntoview(true)", element);
	}
	public void clickjs(WebElement element) {

		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",element);
	}
	public void Simplealert() {
		Alert alert =driver.switchTo().alert();
		alert.accept();
	}
	public void Confirmlert() {
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
	}
	public void promptalert(String data) {
		Alert alert =driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
		alert.dismiss();
	}
	public List<WebElement> getoptions(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public String getoptionstext(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement optionstext : options) {
			String text = optionstext.getText();
			return text;
		}
		return null;
	}
	public void deselectbyindex(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options2 = select.getOptions();

		for (int j = 0; j <options2.size(); j++) {
			select.deselectByIndex(j);
		}
	}
	public List<WebElement> webtable(String attributevalue,String name) {
		WebElement table = driver.findElement(By.id(attributevalue));
		List<WebElement> tableelements = table.findElements(By.tagName(name));
		return tableelements;
	}
	public void screenshot() throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\nithya\\eclipse-workspace\\SeleniumClass1\\Screenshots");
		FileUtils.copyFile(file, dest);
	}
	public void elementscreenshot(WebElement element) throws IOException {
		File file = element.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\nithya\\eclipse-workspace\\SeleniumClass1\\Screenshots");
		FileUtils.copyFile(file, dest);
	}
	public Actions doubleclick(WebElement element) {
		Actions actions=new Actions(driver);
		Actions doubleClick = actions.doubleClick(element);
		return doubleClick;				
	}
	public Actions draganddrop(WebElement source,WebElement target) {
		Actions actions=new Actions(driver);
		Actions dragAndDrop = actions.dragAndDrop(source, target);
		return dragAndDrop;
	}

	public void window() {

		WebElement findElement = driver.findElement(By.id(""));
	}
	//30
	public WebDriver Switchtoframeelement(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;	
	}
	public WebDriver Switchtoframeelementid(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;	
	}
	public WebDriver Switchtoframeindex(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;	
	}
	public WebDriver framedefault(WebElement element) {
		WebDriver frame = driver.switchTo().defaultContent();
		return frame;	
	}
	public String getparentwindow() {
		String parenwindow = driver.getWindowHandle();
		return parenwindow;			
	}
	public Set<String> getallwindow() {
		Set<String> allwindow = driver.getWindowHandles();
		return allwindow;	
	}
	public String getwindow(int windowcount) {
		List<String> l=new ArrayList<String>();
		Set<String> allwindow = driver.getWindowHandles();
		l.addAll(allwindow);
		String string = l.get(windowcount);
		return string;	
	}
	public void staticwait() throws InterruptedException {	
		Thread.sleep(5000);
	}
	public void implicitwait(int time) {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));	
	}
	public void alertispresentwait() {
		WebDriverWait webdriverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		webdriverWait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public WebElement elementtobeclickablewait(WebElement element) {
		WebDriverWait webdriverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement until = webdriverWait.until(ExpectedConditions.elementToBeClickable(element));
		until.click();
		return until;
	}
	public WebElement visibilityofelementwait(String path,String element) {
		WebDriverWait webdriverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement until = webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		until.sendKeys(element);
		return until;
	}
	public WebElement frametobeavailablewait(String xpath,WebElement element) {
		WebDriverWait webdriverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebDriver until = webdriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpath)));
		driver.switchTo().frame(element);
		return element;
	}
	public void navigate(String url) {
		driver.navigate().to(url);	
	}
	public void navigateurl(String url) throws MalformedURLException {
		URL url1=new URL(url);
		driver.navigate().to(url1);	
	}
	public void navigateback() {
		driver.navigate().back();	
	}
	public void navigateforward() {
		driver.navigate().forward();	
	}
	public void navigate() {
		driver.navigate().refresh();;	
	}
	public String getfilefromexcel(String sheetname,String filename) throws IOException {
		File file =new File(filename);
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String string = cell.toString();
				System.out.println(string);
				return string;
			}	
		}
		return null;
	}
	public String dateformat(Date value) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MMM-YY");
		String format = dateFormat.format(value);
		return format;	
	}
	public String numericformat(double value) {
		BigDecimal bigDecimal=BigDecimal.valueOf(value);
		String string = bigDecimal.toString();
		return string;
	}

	public void closechildwindows() {
		driver.close();
	}
	public void closeallwindows() {
		driver.quit();
	}
	public void launchBrowser() {
		driver.get(geturl());
		// TODO Auto-generated method stub
		
		
		
	
	}
	
	
	private void selectByIndex(WebElement element,int no) {
		Select s = new Select (element);
		s.selectByIndex(no);
	}
		public String getpropertyfile(String key) throws IOException {
			FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");

			Properties properties = new Properties();
			properties.load(stream);
			Object name = properties.get(key);
			String value = (String) name;
			return value;

		}

		public void getdrivers(String browserType)  {
			switch (browserType) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				WebDriverManager.chromedriver().setup();
				driver = new FirefoxDriver();

				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();

				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				break;
			}

		}
	

	
	}



