package demoes;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Login {
	WebDriver driver;
	String url="https://www.facebook.com";
	String driverPath="F:\\browsers";
	
	
	public void highlight(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='5px solid yellow'",e);
	}
	
	public void unhighlight(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border=' '", e);
	}
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath +"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void test() throws Exception{
		try {
			WebElement e1=driver.findElement(By.xpath("//*[@id=\"email\"]"));
			highlight(e1);
			e1.sendKeys("peripavankumar@gmail.com");
			Thread.sleep(2000);
			unhighlight(e1);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9390194648");
			Thread.sleep(2000);
			/*driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
			Thread.sleep(2000);*/
			//WebElement ele=driver.findElement(By.xpath("//*[@id=\"BLUE_BAR_ID_DO_NOT_USE\"]/div/div/div[1]/div/div/ul/li[6]"));			
			/*Alert a=driver.switchTo().alert();
			a.dismiss();
			Thread.sleep(2000);*/
			//WebDriverWait wait=new WebDriverWait(driver,20);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"js_20\"]")));
			//ele.click();
			//Thread.sleep(5000);
			
			/*File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File(""));*/
			
		/*	String str=System.getProperty("user.dir"+"\\Cred.xlsx");
			FileInputStream input=new FileInputStream(str);
			
			XSSFWorkbook workbook= new XSSFWorkBook(input);
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			sheet.getRow(i).getCell(0).getStringCellValue();*/
			
			/*Window Handles*/
			/*Set<String> windowHandles=driver.getWindowHandles();
			windowHandles.size();
			for(String str:windowHandles) {
				driver.switchTo().window(str);
			}*/
			
			/*Alert Functions*/
			/*Alert a=driver.switchTo().alert();
			a.accept();
			a.dismiss();
			a.getText();
			a.sendKeys("Text");*/
			
			/*Actions Function*/
			/*Actions a=new Actions(driver);
			a.build().perform();*/
			
			/*Implicit Wait syntax */
			//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			/* Explicit Wait Syntax */
			/*WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));*/
			
		}
		catch(Exception e) {
			System.out.println("Print Stacktrace: ");
			e.printStackTrace();
			System.out.println("Error message is: "+e.getMessage());
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}