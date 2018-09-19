package com.model.requests;

import com.model.transfers.Transfer;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseRequest<T extends Transfer> {

    private String versionId;

    private String login;

    private String password;

    private String senderAccount;

    private String receiverAccount;

}