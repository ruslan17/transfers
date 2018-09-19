package com.controller;

import com.model.Response;
import com.model.transfers.Transfer;
import com.service.transfers.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@SuppressWarnings("unchecked")
@CrossOrigin(origins = "${transfers.cross.origin}", allowCredentials = "false")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TransferController<T extends Transfer> {

    private static final String MEDIA_TYPE = "application/json;charset=UTF-8";

    private final TransferService service;

    @RequestMapping(value = "${transfers.methods.check}", method = RequestMethod.POST, produces = MEDIA_TYPE)
    public Response checkTransfer(@RequestBody @Valid T payment) {
        return service.checkTransfer(payment);
    }

    @RequestMapping(value = "${transfers.methods.approve}", method = RequestMethod.POST, produces = MEDIA_TYPE)
    public Response approveTransfer(@RequestBody @Valid T payment) {
        return service.approveTransfer(payment);
    }

}