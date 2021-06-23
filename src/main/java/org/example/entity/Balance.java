package org.example.entity;

import lombok.Data;

@Data
public class Balance {

    private String accountId;
    private String description;
    private long balance;

}
