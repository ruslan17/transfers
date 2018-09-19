package com.service.builders.impl;

import com.model.requests.SwiftRequest;
import com.model.transfers.SwiftTransfer;
import com.service.builders.RequestBuilder;
import org.springframework.stereotype.Component;

@Component
public class SwiftRequestBuilder implements RequestBuilder<SwiftTransfer> {

    @Override
    public SwiftRequest createRequest(SwiftTransfer transfer) {

        return SwiftRequest.builder()
                .versionId("")
                .login("")
                .password("")
                .senderAccount(transfer.getSenderAccount())
                .receiverAccount(transfer.getReceiverAccount())
                .receiverName(transfer.getReceiverName())
                .receiverCountry(transfer.getReceiverCountry())
                .receiverBankCode(transfer.getReceiverBankCode())
                .currency(transfer.getCurrency())
                .commissionAccount(transfer.getCommissionAccount())
                .amount(String.valueOf(transfer.getAmount()))
                .build();
    }

}