package kz.iitu.atm.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Account {
    @Id
    private Long id;

    private String login;

    private String pin;

    private Long balance;

    @ManyToOne
    private Bank bank;
}
