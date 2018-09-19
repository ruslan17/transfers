package com.service.transfers;

import com.model.requests.BaseRequest;
import com.model.transfers.Transfer;

@FunctionalInterface
public interface RequestBuildersFactory {

    <T extends Transfer> BaseRequest<T> transferToRequest(T transfer);

}