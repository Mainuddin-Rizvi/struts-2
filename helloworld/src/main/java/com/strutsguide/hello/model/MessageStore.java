package com.strutsguide.hello.model;

public class MessageStore {
    private String message;

    public MessageStore() {
        this.message = "Hello Struts User!";
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String toString() {
        return message + " (from toString)";
    }
	
}
