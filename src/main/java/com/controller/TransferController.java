package com.controller;

import com.model.Response;
import com.model.transfers.Transfer;
import com.service.transfers.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TransferController<T extends Transfer> {

    private final TransferService<T> service;

    @PostMapping(value = "${transfers.methods.check}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response checkTransfer(@RequestBody @Valid T payment) {
        return service.checkTransfer(payment);
    }

    @PostMapping(value = "${transfers.methods.approve}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response approveTransfer(@RequestBody @Valid T payment) {
        return service.approveTransfer(payment);
    }

}