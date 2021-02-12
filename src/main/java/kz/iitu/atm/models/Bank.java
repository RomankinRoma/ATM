package kz.iitu.atm.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Bank {
    @Id
    private Long id;

    private String name;

    @OneToMany
    private List<Account> users;
}
