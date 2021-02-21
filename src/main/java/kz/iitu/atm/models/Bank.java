package kz.iitu.atm.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import javax.persistence.*;
import java.util.List;

@Data
//@Entity
@Component
public class Bank {
//    @Id
    @Value("1")
    private Integer id;
    @Value("${bank.name}")
    private String name;

//    @OneToMany
    private List<Account> users;

    public Bank() {
    }

    @Autowired
    public Bank( List<Account> users) {
        this.users = users;
    }
}
