package com.strutsguide.hello.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.strutsguide.hello.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport{
    private static final long serialVersionUID = 1L;

	private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;



    @Override
    public String execute() {
        messageStore = new MessageStore();
        //Action included a query string parameter of userName
        //or a form field with name of userName
        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }
        helloCount++;
        return SUCCESS; // SUCCESS is mapped to the view (JSP).
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
	
    public int getHelloCount() {
        return helloCount;
        
    }

    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
