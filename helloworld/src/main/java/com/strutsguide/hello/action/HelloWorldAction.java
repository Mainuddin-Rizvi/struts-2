package com.strutsguide.hello.action;

import com.strutsguide.hello.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private MessageStore messageStore;

    @Override
    public String execute() {
        messageStore = new MessageStore();
        return SUCCESS; // SUCCESS is mapped to the view (JSP).
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
