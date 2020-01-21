package br.com.wildrimak.creational.singleton;

public class CustomerWindow {

	public static void main(String[] args) {

		Window window = Window.getInstance();

		window.state();
		window.open();
		window.state();

		Window window2 = Window.getInstance();

		System.out.println(window.equals(window2));

	}

}
