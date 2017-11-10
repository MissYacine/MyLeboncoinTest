package com.leboncoin.test.MyLeboncoinTest.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
private static WebElement element = null;
private static final By byBtnSeConnecter = By.xpath(".//*[@id='header']/section/section/aside/button");
private static final By byTxtUserName = By.xpath(".//*[@id='st_username']");
private static final By byTxtPassword = By.xpath(".//*[@id='st_passwd']");
private static final By byBtnLogin = By.xpath(".//*[@id='popin-content']/section/main/section[1]/div/form/div[3]/div/input");



//load page 
public static WebDriver loadPage(WebDriver driver){
	
	driver.get("https://www.leboncoin.fr/");
	driver.manage().window().maximize();
	return driver;
}
//Button se connecter
public static WebElement btn_Seconnecter(WebDriver driver) throws NoSuchElementException{
	clickElement(driver, element);
	element = driver.findElement(byBtnSeConnecter);
	return element;
	
}
//Text fields
public static WebElement txtbx_UserName(WebDriver driver) throws NoSuchElementException{
	element = driver.findElement(byTxtUserName);
	return element;
}
public static WebElement txtbx_Password(WebDriver driver) throws NoSuchElementException{
	element = driver.findElement(byTxtPassword);
	return element;
}
// Button
	public static WebElement btn_Login(WebDriver driver) throws NoSuchElementException{
	element = driver.findElement(byBtnLogin);
	return element;
}

	
	
	protected static void waitForClickable( WebDriver driver,
			WebElement element, int duration) {
		for (int x = 0; x <= 5; x++) {
			try {
				new WebDriverWait(driver, duration).until(ExpectedConditions
						.elementToBeClickable(element));
				break;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
		}
	}
	protected static void clickElement( WebDriver driver,
			WebElement element) {
		waitForClickable( driver, element, 5);
		element.click();
	}
	
	
	
	
	
	
	
	
	
	
}

