package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//1.
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	//2
	public static void winMax() {
		driver.manage().window().maximize();
	}
	
	//3
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	//4
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//5
	public static void printCurrentUrl() {
		String current = driver.getCurrentUrl();
		System.out.println(current);
	}
	
	//6
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	//7
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	
	//8
	public static void closeChrome() {
		driver.close();
	}
	
	//9
	public static String getData(int rowNumber, int cellNumber) throws IOException {
	
		// 1. Mention the file location
		File f = new File("C:\\Kannan\\EclipseProjects\\26thDecProjectClass\\target\\TestData\\2ndMayBatch.xlsx");

		// 2. Read the value from excel sheet
		FileInputStream fin = new FileInputStream(f);

		// 3. Type of Workbook
		Workbook w = new XSSFWorkbook(fin);

		// 4. Get the sheet
		Sheet s = w.getSheet("greens");
		
		//5. Get the row
		Row row = s.getRow(rowNumber);
		
		//6. Get the cell
		Cell cell = row.getCell(cellNumber);
		
		int cellType = cell.getCellType();  // 1----> String ; 0-----> int or date
		String value="";
		if (cellType==1) {
			
			value = cell.getStringCellValue();
		}
		else if (cellType==0) {
			
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd, MMMM, yyyy");
				value = sim.format(d);	
			}
			else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
				 value = String.valueOf(l);
			}
			
		}
		
		return value;		

	}
	

//	public static void screenshot(String name) throws IOException {
//
//		TakesScreenshot tk = (TakesScreenshot) driver;
//
//		File src = tk.getScreenshotAs(OutputType.FILE);
//
//		File des = new File("C:\\Kannan\\EclipseProjects\\26thDecProjectClass\\target\\Screenshots\\" + name + ".jpg");
//
//		FileUtils.copyFile(src, des);
//	}
	
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File dsc = new File("C:\\Kannan\\EclipseProjects\\26thDecProjectClass\\target\\screenshot\\"+name+".jpg");
		
		FileUtils.copyFile(src, dsc);
	}
	
	
	public static void quitBrowser() {
		driver.quit();
		System.out.println("Kannan Pushed");
		System.out.println("Vijay Pushed");

	}

	
	
	

}
