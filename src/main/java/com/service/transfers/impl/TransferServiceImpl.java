package com.service.transfers.impl;

import com.model.Response;
import com.model.requests.BaseRequest;
import com.model.transfers.Transfer;
import com.service.transfers.RequestBuildersFactory;
import com.service.transfers.TransferService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {

    @Setter(onMethod = @__(@Autowired))
    private RequestBuildersFactory requestBuildersFactory;

    @Override
    public Response checkTransfer(Transfer transfer) {
        Response response = new Response();
        BaseRequest<Transfer> request = requestBuildersFactory.transferToRequest(transfer);
        //TODO send request, and return response
        return response;
    }

    @Override
    public Response approveTransfer(Transfer transfer) {
        return null;
    }

}