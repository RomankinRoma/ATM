package kz.iitu.atm.service;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class BankServiceForBean {
    String url;
    String user;
    String password;


    @PostConstruct
    public void init(){
        openConnection();
    }

    @PreDestroy
    public void destroy(){
        closeConnection();
    }
    public void openConnection(){
        System.out.println("We opened connection!");
    }
    public void closeConnection(){
        System.out.println("We closed connection");
    }
}
