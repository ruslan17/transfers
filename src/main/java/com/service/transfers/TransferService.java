package com.service.transfers;

import com.model.Response;
import com.model.requests.BaseRequest;
import com.model.transfers.Transfer;
import org.springframework.stereotype.Service;

@Service
public class TransferService<T extends Transfer> {

    private RequestBuildersFactory<T> requestBuildersFactory;

    public TransferService(RequestBuildersFactory<T> requestBuildersFactory) {
        this.requestBuildersFactory = requestBuildersFactory;
    }

    public Response checkTransfer(T transfer) {
        Response response = new Response();
        BaseRequest<T> request = requestBuildersFactory.transferToRequest(transfer);
        //TODO send request, and return response
        return response;
    }

    public Response approveTransfer(Transfer transfer) {
        return new Response();
    }

}