package com.strutsguide.hello.action;
import com.opensymphony.xwork2.ActionSupport;
import com.strutsguide.hello.model.Person;

public class Register extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    
    private Person personBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        
        return SUCCESS;
    }

    @StrutsParameter(depth = 1)
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }

}
