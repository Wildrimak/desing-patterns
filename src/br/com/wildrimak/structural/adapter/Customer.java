package br.com.wildrimak.structural.adapter;

import br.com.wildrimak.structural.adapter.api_accessible_now.AdapterPinSocket;
import br.com.wildrimak.structural.adapter.api_accessible_now.ThreePinSocket;

public class Customer {
	
	public static void main(String[] args) {
		
		ThreePinSocket threePinSocket = new ThreePinSocket();
		AdapterPinSocket adapterPinSocket = new AdapterPinSocket(threePinSocket);
		adapterPinSocket.plugInTwoPinSocket();
	}

}
