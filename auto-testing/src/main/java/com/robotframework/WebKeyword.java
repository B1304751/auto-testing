package com.robotframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebKeyword {
	
	private static ChromeDriver browser;
	private static WebDriverWait wait;
	
	public void init() {
		browser  = new ChromeDriver();
		wait = new WebDriverWait(browser, 5);
	}
	
	public void loginGmail(String email, String password) {
//		open browser to specifices url
		browser.get("https://google.com");
		browser.manage().window().maximize();
//		click buton "Đăng nhập"
		WebElement webElement = browser.findElementById("gb_70");
		webElement.click();
//		input email
		webElement = browser.findElementByXPath("//input[@type='email']");
		webElement.sendKeys(email);
//		click next
		webElement = browser.findElementById("identifierNext");
		webElement.click();
//		input password
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		webElement = browser.findElementByXPath("//input[@name='password']");
		webElement.sendKeys(password);
//		click next
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordNext")));
		webElement = browser.findElementById("passwordNext");
		webElement.click();
		
//		click avatar email
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a")));
		webElement = browser.findElementByXPath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a");
		webElement.click();
		
//		get email 
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[2]/div[1]/div/div[2]")));
		webElement = browser.findElementByXPath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[2]/div[1]/div/div[2]");
		
	}
	
	public void searchGoogle(String key) {
//		initialzing condition for searching
//		loginGmail("ribostrush@gmail.com", "091616Package");
//		input keyword
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
		webElement = browser.findElementById("lst-ib");
		webElement.click();
		webElement.sendKeys(key);
		
//		enter for first result
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a")));
		webElement = browser.findElementByXPath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a");
		webElement.click();
		
	}
	
	public void playYoutube() {
//		initializing condition for playing
//		searchGoogle("youtube");
//		click on my music list
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"VLPLiPopaJ6ym29aFgpkHX6LoAYYtU-nvIop-guide-item\"]/a/span/span[2]/span")));
		webElement = browser.findElementByXPath("//*[@id=\"VLPLiPopaJ6ym29aFgpkHX6LoAYYtU-nvIop-guide-item\"]/a/span/span[2]/span");
		webElement.click();
		
//		playing first song
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pl-load-more-destination\"]/tr[1]/td[4]/a")));
		webElement = browser.findElementByXPath("//*[@id=\"pl-load-more-destination\"]/tr[1]/td[4]/a");
		webElement.click();
		
//		get title
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"eow-title\"]")));
		webElement = browser.findElementByXPath("//*[@id=\"eow-title\"]");
		webElement.getText();
		
	}
	
	public void playNext() {
//		initialzing condition for play next
//		playYoutube();
//		play second song
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"playlist-autoscroll-list\"]/li[8]/a/div/h4")));
		webElement = browser.findElementByXPath("//*[@id=\"playlist-autoscroll-list\"]/li[8]/a/div/h4");
		webElement.click();
		
//		get title
		wait.until(ExpectedConditions.titleContains("Đan Nguyên - Lại Nhớ Người Yêu (Giao Tiên) PBN 119 - YouTube"));
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eow-title")));
		webElement = browser.findElementById("eow-title");

	}
	
	public void closeAll() {
		browser.close();
	}
	
}
