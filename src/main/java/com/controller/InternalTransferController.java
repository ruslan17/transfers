package com.controller;

import com.model.transfers.InternalTransfer;
import com.service.transfers.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${transfers.route.internal}")
public class InternalTransferController extends TransferController<InternalTransfer> {

    @Autowired
    public InternalTransferController(TransferService<InternalTransfer> service) {
        super(service);
    }

}