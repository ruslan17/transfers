package com.model.requests;

import com.model.transfers.SwiftTransfer;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SwiftRequest extends BaseRequest<SwiftTransfer> {

    private String amount;

    private String currency;

    private String receiverName;

    private String receiverCountry;

    private String receiverBankCode;

    private String commissionAccount;

    private String destinationPayment;

    @Builder
    public SwiftRequest(String versionId, String login, String password, String senderAccount,
                        String receiverAccount, String amount, String currency, String receiverName,
                        String receiverCountry, String receiverBankCode, String commissionAccount, String destinationPayment) {
        super(versionId, login, password, senderAccount, receiverAccount);
        this.amount = amount;
        this.currency = currency;
        this.receiverName = receiverName;
        this.receiverCountry = receiverCountry;
        this.receiverBankCode = receiverBankCode;
        this.commissionAccount = commissionAccount;
        this.destinationPayment = destinationPayment;
    }
}