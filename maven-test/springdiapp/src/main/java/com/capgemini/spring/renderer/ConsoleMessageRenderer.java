package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;

public class ConsoleMessageRenderer implements MessageRenderer {
	private MessageProvider provider;
	
	public ConsoleMessageRenderer(MessageProvider provider) {
		this.provider = provider;
	}
	public ConsoleMessageRenderer() {
	}

	public void setProvider(MessageProvider provider) {
		this.provider = provider;
	}

	public void render() {
		System.out.println(provider.getMessage());
	}
}
