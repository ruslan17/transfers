package com.service.builders.impl;

import com.model.requests.SwiftRequest;
import com.model.transfers.SwiftTransfer;
import com.service.builders.RequestBuilder;
import org.springframework.stereotype.Component;

@Component
public class SwiftRequestBuilder implements RequestBuilder<SwiftTransfer> {

    @Override
    public SwiftRequest createRequest(SwiftTransfer transfer) {
        return new SwiftRequest();
    }

}