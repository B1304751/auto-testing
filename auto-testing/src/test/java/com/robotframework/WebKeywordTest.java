/**
 * 
 */
package com.robotframework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.TestCase;

import static org.mockito.Mockito.*;

import org.apache.log4j.Logger;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

/**
 * @author lny
 * @param <T>
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class WebKeywordTest<T> extends TestCase{
	
	private WebKeyword selenium;
	private WebKeyword spy;
	
	private static Logger logger = Logger.getLogger(WebKeyword.class);

	/**
	 * @throws java.lang.Exception
	 */
	
	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("============ START UNIT TEST ==============");
    }
 
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        logger.info("============ END UNIT TEST ==============");
    }
	
	@Before
	public void setUp() throws Exception {
		logger.info("setting mock object");
		selenium = new WebKeyword();
		spy = spy(selenium);
		spy.init();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		logger.info("teardown mock");
		spy.closeAll();
	}

	/**
	 * Test method for {@link com.robotframework.WebKeyword#loginGmail(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLoginGmail() {
		logger.info("testing login gmail");
		doAnswer(new Answer<T>() {

			public T answer(InvocationOnMock invocation) throws Throwable {
				String email = invocation.getArgument(0);
				String pass = invocation.getArgument(1);
				if (email.length() >= 8 && pass.length() >= 6) {
					logger.info(email + " " + pass);
					logger.info("valid arguments");
				}
				return null;
			}
		}).when(spy).loginGmail("ribostrush@gmail.com", "123456");
		spy.loginGmail("ribostrush@gmail.com", "123456");
		verify(spy).loginGmail("ribostrush@gmail.com", "123456");
	}
	
	@Test
	public void testSearchGoogle() {
		logger.info("google search testing");
		doAnswer(new Answer<T>() {

			public T answer(InvocationOnMock invocation) throws Throwable {
				String key = invocation.getArgument(0);
				if (key.length() > 0) {
					logger.info("valid key");
				}
				return null;
			}
		}).when(selenium).searchGoogle("youtube");
		selenium.searchGoogle("youtube");
		verify(selenium).searchGoogle("youtube");
	}
	
	@Test
	public void testPlayYoutube() {
		
	}
	
	@Test
	public void testPlayNext() {
		
	}

}
