package com.strutsguide.hello.action;

import com.strutsguide.hello.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
    private static final long serialVersionUID = 1L;

	private MessageStore messageStore;
    private static int helloCount = 0;


    @Override
    public String execute() {
        messageStore = new MessageStore();
        helloCount++;
        return SUCCESS; // SUCCESS is mapped to the view (JSP).
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
	
    public int getHelloCount() {
        return helloCount;
    }
}
