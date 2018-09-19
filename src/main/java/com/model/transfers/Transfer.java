package com.model.transfers;

import com.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transfer extends BaseEntity<Integer> {

    private String paymentNumber;

    private Double amount;

    private LocalDate date;

    private String senderAccount;

    private String receiverName;

    private String receiverAccount;

}