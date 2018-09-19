package com.service.transfers.impl;

import com.model.requests.BaseRequest;
import com.model.transfers.Transfer;
import com.service.builders.RequestBuilder;
import com.service.transfers.RequestBuildersFactory;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@SuppressWarnings("unchecked")
@Component
public class RequestBuildersFactoryImpl implements RequestBuildersFactory {

    @Setter(onMethod = @__(@Autowired))
    private ApplicationContext context;

    @Override
    public <T extends Transfer> BaseRequest<T> transferToRequest(T transfer) {

        ResolvableType type = ResolvableType.forClassWithGenerics(RequestBuilder.class, transfer.getClass());
        String[] beanNamesForType = context.getBeanNamesForType(type);
        RequestBuilder<T> builder = (RequestBuilder<T>) context.getBean(beanNamesForType[0]);

        return builder.createRequest(transfer);
    }

}