package kz.iitu.atm.models;

import lombok.Data;
import org.springframework.stereotype.Component;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Data
//@Entity
@Component
public class Account {
//    @Id
    private Long id;

    private String login;

    private String pin;

    private Long balance;

//    @ManyToOne
    private Bank bank;

    public Account() {
    }

    public Account(String login, String pin, Long balance, Bank bank) {
        this.login = login;
        this.pin = pin;
        this.balance = balance;
        this.bank = bank;
    }
}
