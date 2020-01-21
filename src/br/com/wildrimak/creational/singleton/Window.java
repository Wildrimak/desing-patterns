package br.com.wildrimak.creational.singleton;

public class Window {

	private static Window instance;
	private boolean open;

	private Window() {
	}

	public static Window getInstance() {

		if (instance == null)
			instance = new Window();

		return instance;

	}

	public void open() {
		this.open = true;
	}

	public void close() {
		this.open = false;
	}
	
	public void state() {
	
		if (open)
			System.out.println("The window is open");
		else
			System.out.println("The window is closed");
	}
	

}
