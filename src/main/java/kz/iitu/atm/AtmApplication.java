package kz.iitu.atm;

import kz.iitu.atm.config.Config;
import kz.iitu.atm.models.Bank;
//import kz.iitu.atm.repository.AccounRepository;
//import kz.iitu.atm.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class, args);



    }

}
