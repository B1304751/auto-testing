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
	
	public String loginGmail(String email, String password) {
//		open browser to specifices url
		browser.get("https://google.com");
		browser.manage().window().maximize();
//		click butong "Đăng nhập"
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
		webElement = browser.findElementById("passwordNext");
		webElement.click();
		
//		text id email
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a")));
		webElement = browser.findElementByXPath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a");
		
		return webElement.getAttribute("title");
	}
	
	public String searchGoogle(String key) {
//		initialzing condition for searching
		loginGmail("ribostrush@gmail.com", "091616Package");
//		input keyword
		WebElement webElement = browser.findElementById("lst-ib");
		webElement.sendKeys(key);
		
//		enter for first result
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a")));
		webElement = browser.findElementByXPath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a");
		webElement.click();
		
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"yt-masthead-account-picker\"]/button/span/span/span/span/img")));
		webElement = browser.findElementByXPath("//*[@id=\"yt-masthead-account-picker\"]/button/span/span/span/span/img");
		
		return webElement.getAttribute("src");
	}
	
	public String playYoutube() {
//		initializing condition for playing
		searchGoogle("youtube");
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
		
		return webElement.getAttribute("title");
	}
	
	public String playNext() {
		//initialzing condition for play next
		playYoutube();
//		play second song
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"playlist-autoscroll-list\"]/li[8]/a/div/h4")));
		webElement = browser.findElementByXPath("//*[@id=\"playlist-autoscroll-list\"]/li[8]/a/div/h4");
		webElement.click();
		
//		get title
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"eow-title\"]")));
		webElement = browser.findElementByXPath("//*[@id=\"eow-title\"]");
		
		return webElement.getAttribute("title");
	}
	
	public static void main(String[] args) {
		WebKeyword webKeyword = new WebKeyword();
		webKeyword.init();
		System.out.println(webKeyword.playNext());
	}
}
