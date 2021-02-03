package kz.iitu.atm.models;

import lombok.Data;

@Data
public class Account {

    private Long id;

    private String login;

    private String pin;

    private Long balance;
}
