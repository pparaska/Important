package com.capgemini.spring;

import java.util.ResourceBundle;

interface MessageProvider {
	public String getMessage();
}
class HWMessageProvider implements MessageProvider {
	public String getMessage() {
		return "Hello World!";
	}
}
class GMMessageProvider implements MessageProvider {
	public String getMessage() {
		return "Goood Morning!";
	}
}
class ConsoleMessageRenderer {
	private MessageProvider provider;
	public ConsoleMessageRenderer() {
	}
	public ConsoleMessageRenderer(MessageProvider provider) {
		this.provider = provider;
	}
	public void setProvider(MessageProvider provider) {
		this.provider = provider;
	}
	public void render() {
		System.out.println(provider.getMessage());
	}
}
final class MessageContext {
	private static MessageContext messageContext = new MessageContext();
	private MessageContext() {}
	public static MessageContext getInstance() {
		return messageContext;
	}
	public ConsoleMessageRenderer getRenderer() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ResourceBundle bundle = ResourceBundle.getBundle("context");
		String providerName=bundle.getString("provider");
		MessageProvider provider = (MessageProvider) Class.forName(providerName).newInstance();
		ConsoleMessageRenderer renderer = new ConsoleMessageRenderer(provider);
		return renderer;
	}
}
public class App 
{
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
    	MessageContext messageContext = MessageContext.getInstance();
    	ConsoleMessageRenderer renderer = messageContext.getRenderer();
        renderer.render();
    }
}
