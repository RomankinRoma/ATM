package kz.iitu.atm.config;

import kz.iitu.atm.models.Account;
import kz.iitu.atm.models.Bank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.iitu.atm")
@PropertySource("application.properties")
public class Config {

    @Bean
    public List<Account> accountList(){
        List<Account> accountList=new ArrayList<>();
        accountList.add(new Account("123","123", 123L,new Bank()));
        accountList.add(new Account("1234","1234", 1234L,new Bank()));
        accountList.add(new Account("1235","1235", 1235L,new Bank()));
        accountList.add(new Account("1236","1236", 1236L,new Bank()));
        return accountList;
    }

    @Bean
    public void connect(){

    }
}
