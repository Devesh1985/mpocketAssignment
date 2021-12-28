package com.mysamplecompany.SamplePOMProject.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static String browser;
	
	
	public static void initConfiguration(){
		
		if(Constants.browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver1.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			wait = new WebDriverWait(driver, Constants.explicitwait);
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();	
	}
	
	
	public static void click(WebElement element) {

		element.click();
	}
	
	public static String getText(WebElement element) {

		return element.getText();
	}
	
    public static void switchWindow() { 	
    

    	
    	for(String winHandle : driver.getWindowHandles()){
    	    driver.switchTo().window(winHandle);
    	    
    	}System.out.println(driver.getTitle());

    }
	
	
	public static void type(WebElement element, String value) {

		element.sendKeys(value);
	}
	
	public static void waitTillElementPresent(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void selectFromDropDown(WebElement element, String value) {

		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public static void quitBrowser(){
		
		driver.quit();
		
	}
}
