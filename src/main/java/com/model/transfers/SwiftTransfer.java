package com.model.transfers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class SwiftTransfer extends Transfer {

    private String currency;

    private String receiverBankCode;

    private String receiverCountry;

    private String commissionAccount;

}