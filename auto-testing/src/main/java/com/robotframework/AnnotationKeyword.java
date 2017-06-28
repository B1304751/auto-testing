package com.robotframework;
import org.robotframework.javalib.annotation.*;

@RobotKeywords
public class AnnotationKeyword {
	
	@RobotKeyword
	public void LoggingOfMe() {
		System.out.println("Jello!");
	}
}
