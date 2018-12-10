package com.model.transfers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SwiftTransfer extends Transfer {

    private String currency;

    private String receiverBankCode;

    private String receiverCountry;

    private String commissionAccount;

}