/**
 * 
 */
package com.robotframework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.TestCase;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author lny
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class WebKeywordTest extends TestCase{
	
	private WebKeyword webKeyword;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		webKeyword = mock(WebKeyword.class);
		webKeyword.init();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		webKeyword.closeAll();
	}

	/**
	 * Test method for {@link com.robotframework.WebKeyword#loginGmail(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLoginGmail() {
		
	}
	
	@Test
	public void testSearchGoogle() {
	}
	
	@Test
	public void testPlayYoutube() {
	}
	
	@Test
	public void testPlayNext() {
	}

}
