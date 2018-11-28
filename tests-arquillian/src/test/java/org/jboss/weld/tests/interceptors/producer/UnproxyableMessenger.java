package org.jboss.weld.tests.interceptors.producer;

public final class UnproxyableMessenger implements Messenger {
	
	private final String message;

	public UnproxyableMessenger(String message) {
		this.message = message;
	}
	
	@Override
	public String message() {
		return message;
	}	
}
