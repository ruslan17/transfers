package com.service.builders;

import com.model.requests.BaseRequest;
import com.model.transfers.Transfer;

public interface RequestBuilder<T extends Transfer> {

    BaseRequest<T> createRequest(T transfer);

}