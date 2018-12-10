package com.model.transfers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class InternalTransfer extends Transfer {

    private Boolean toOwnAccount;

}