package com.model.requests;

import com.model.transfers.InternalTransfer;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class InternalRequest extends BaseRequest<InternalTransfer> {

    private String amount;

    @Builder
    public InternalRequest(String versionId, String login, String password, String senderAccount, String receiverAccount, String amount) {
        super(versionId, login, password, senderAccount, receiverAccount);
        this.amount = amount;
    }
}
