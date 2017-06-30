//package com.robotframework;
//
//import org.robotframework.javalib.annotation.RobotKeyword;
//import org.robotframework.javalib.annotation.RobotKeywords;
//
//import com.github.markusbernhardt.selenium2library.Selenium2Library;
//import com.github.markusbernhardt.selenium2library.keywords.BrowserManagement;
//import com.github.markusbernhardt.selenium2library.keywords.Element;
//import com.github.markusbernhardt.selenium2library.keywords.FormElement;
//import com.github.markusbernhardt.selenium2library.keywords.Waiting;
//
//@RobotKeywords
//public class AutoTesting {
//	
//	private static Selenium2Library selenium2Library;
//	private static BrowserManagement browserManagement;
//	private static Element element;
//	private static FormElement formElement;
//	private static Waiting waiting;
//	
//	@RobotKeyword("Init")
//	public void init() throws Throwable {
//		selenium2Library = Selenium2Library.getLibraryInstance();
//		browserManagement = selenium2Library.getBrowserManagement();
//		element = selenium2Library.getElement();
//		formElement = selenium2Library.getFormElement();
//		waiting = selenium2Library.getWaiting();
//	}
//	
//	@RobotKeyword("Logging Gmail")
//	public String loggingGmail(String email, String password) throws Throwable{
//		browserManagement.openBrowser("https://google.com", "Chrome");
//		browserManagement.maximizeBrowserWindow();
//		
////		click on Login button on Google homepage
//		element.clickElement("id=gb_70");
//		
////		input email value
//		formElement.inputText("xpath=//input[@type='email']", email);
//		
////		click next button
//		element.clickElement("id=identifierNext");
//		
////		wating for element visible
//		waiting.waitUntilElementIsVisible("xpath=//input[@name='password']");
//		
////		input password value
//		formElement.inputPassword("xpath=//input[@name='password']", password);
//		
////		click next button
//		element.clickElement("xpath=//*[@id=\"passwordNext\"]/content/span");
//		
//		return browserManagement.getTitle();
//	}
//	
//	@RobotKeyword("Search On Google")
//	public void searchOnGoogle(String key) {
//		
////		wating for element visible
//		waiting.waitUntilElementIsVisible("id=lst-ib");
//		
////		input search value
//		formElement.inputText("id=lst-ib", key);
//		
////		wating for element visible
//		waiting.waitUntilElementIsVisible("xpath=//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a");
//		
////		press first search result
//		element.pressKey("xpath=//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a", "\\13");
//	}
//	
//	@RobotKeyword("Play Song Youtube")
//	public void playSongYoutube() {
////		waiting for visible
//		waiting.waitUntilElementIsVisible("xpath=//*[@id=\"VLPLiPopaJ6ym29aFgpkHX6LoAYYtU-nvIop-guide-item\"]/a/span/span[2]/span");
//		
////		click my music list on youtube home
//		element.clickElement("xpath=//*[@id=\"VLPLiPopaJ6ym29aFgpkHX6LoAYYtU-nvIop-guide-item\"]/a/span/span[2]/span");
//		
////		waiting for visible
//		waiting.waitUntilElementIsVisible("xpath=//*[@id=\"pl-load-more-destination\"]/tr[1]/td[4]/a");
//		
////		click song name :"Có em chờ"
//		element.clickElement("xpath=//*[@id=\"pl-load-more-destination\"]/tr[1]/td[4]/a");
//		
//	}
//	
//	@RobotKeyword("Play Next")
//	public void playNext() {
////		waiting for visible
//		waiting.waitUntilElementIsVisible("xpath=//*[@id=\"playlist-autoscroll-list\"]/li[8]/a/div/h4");
//		
////		click song name :""
//		element.clickElement("xpath=//*[@id=\"playlist-autoscroll-list\"]/li[8]/a/div/h4");
//	}
//	
//	@RobotKeyword("Close Testing")
//	public void closeTesting() {
//		browserManagement.closeBrowser();
//	}
//	
//	public static void main(String[] args) throws Throwable {
//		Selenium2Library selenium2library = Selenium2Library.getLibraryInstance();
//	}
//}
