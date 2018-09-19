package com.service.transfers;

import com.model.Response;
import com.model.transfers.Transfer;

public interface TransferService<T extends Transfer> {

    Response checkTransfer(T payment);

    Response approveTransfer(T payment);

}
