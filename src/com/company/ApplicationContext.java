package com.company;

/**
 * @author leyla.markosyan on 4/17/2017.
 */
public class ApplicationContext {
	protected Integer id;
	private String language;

	private ApplicationContext() {
	}

	private ApplicationContext(Integer id, String language) {
		this.id = id;
		this.language = language;
	}

	private static class SingletonHolder {
		private static ApplicationContext context = new ApplicationContext(1, "bgd");
	}

	public static ApplicationContext getInstance() {
		return SingletonHolder.context;
	}

	public void print() {
		System.out.println("I am a singleton!");
	}

	public Integer getId() {
		return id;
	}

	public String getLanguage() {
		return language;
	}


}
