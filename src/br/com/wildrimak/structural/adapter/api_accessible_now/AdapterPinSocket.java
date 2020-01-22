package br.com.wildrimak.structural.adapter.api_accessible_now;

import br.com.wildrimak.structural.adapter.incosumible_external_api.TwoPinSocket;

public class AdapterPinSocket extends TwoPinSocket {
  
	private ThreePinSocket threePinSocket;
		
	public AdapterPinSocket(ThreePinSocket threePinSocket) {
		this.threePinSocket = threePinSocket;
	}
	
	@Override
	public void plugInTwoPinSocket() {
		threePinSocket.plugInThreePinSocket();
	}
	
}
