package com.controller;

import com.model.transfers.SwiftTransfer;
import com.service.transfers.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${transfers.route.swift}")
public class SwiftTransferController extends TransferController<SwiftTransfer> {

    @Autowired
    public SwiftTransferController(TransferService<SwiftTransfer> service) {
        super(service);
    }

}