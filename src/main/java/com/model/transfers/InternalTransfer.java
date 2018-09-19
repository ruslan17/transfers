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
public class InternalTransfer extends Transfer {

    private Boolean toOwnAccount;

}