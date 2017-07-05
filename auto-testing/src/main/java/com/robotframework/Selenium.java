package com.robotframework;

public interface Selenium {
	public void init();
	public void loginGmail(String email, String password);
	public void searchGoogle(String key);
	public void playYoutube();
	public void playNext();
	public void closeAll();
}
