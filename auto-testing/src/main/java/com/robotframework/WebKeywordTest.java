/**
 * 
 */
package com.robotframework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author lny
 *
 */
public class WebKeywordTest extends TestCase{
	
	WebKeyword webKeyword;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		webKeyword = new WebKeyword();
		webKeyword.init();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.robotframework.WebKeyword#loginGmail(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLoginGmail() {
		String actual = webKeyword.loginGmail("ribostrush@gmail.com", "091616Package");
		String expect = "Tài khoản Google: Ribos Trush  \n"
						+ "(ribostrush@gmail.com)";
		assertEquals(expect, actual);
	}
	
	@Test
	public void testSearchGoogle() {
		String actual = webKeyword.searchGoogle("youtube");
		String expect = "https://yt3.ggpht.com/-OVqkxzikuWI/AAAAAAAAAAI/AAAAAAAAAAA/xklac_a7C2A/s88-c-k-no-mo-rj-c0xffffff/photo.jpg";
		assertEquals(expect, actual);
	}
	
	@Test
	public void playYoutube() {
		String actual = webKeyword.playYoutube();
		String expect = "CÓ EM CHỜ - OFFICIAL MV FULL | MIN FT MR A";
		assertEquals(expect, actual);
	}
	
	@Test
	public void playNext() {
		String actual = webKeyword.playNext();
		String expect = "Đan Nguyên - Lại Nhớ Người Yêu (Giao Tiên) PBN 119";
		assertEquals(expect, actual);
	}

}
