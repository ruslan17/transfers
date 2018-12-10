package com.service.builders.impl;

import com.model.requests.InternalRequest;
import com.model.transfers.InternalTransfer;
import com.service.builders.RequestBuilder;
import org.springframework.stereotype.Component;

@Component
public class InternalRequestBuilder implements RequestBuilder<InternalTransfer> {

    @Override
    public InternalRequest createRequest(InternalTransfer transfer) {
        return new InternalRequest();
    }
}