package com.robotframework;

import org.robotframework.javalib.keyword.Keyword;

public class InterfaceKeyword implements Keyword{

	@Override
	public Object execute(Object[] arg0) {
		System.out.println("Jello, Men!");
		return Boolean.TRUE;
	}

}
