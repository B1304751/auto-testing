package com.robotframework;
import org.robotframework.javalib.annotation.Autowired;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import com.github.markusbernhardt.selenium2library.keywords.BrowserManagement;

@RobotKeywords
public class LoginGmail{
	
	@Autowired
	BrowserManagement browser;
	
	@RobotKeyword
	public void loggingGmail() throws Throwable{
		browser.openBrowser("https://google.com");
	}
	
}
