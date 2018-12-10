package com.service.transfers;

import com.model.requests.BaseRequest;
import com.model.transfers.Transfer;
import com.service.builders.RequestBuilder;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RequestBuildersFactory<T extends Transfer> {

    private final List<RequestBuilder<T>> builders;

    public RequestBuildersFactory(List<RequestBuilder<T>> builders) {
        this.builders = builders;
    }

    public BaseRequest<T> transferToRequest(T transfer) {

        ResolvableType type = ResolvableType.forClassWithGenerics(RequestBuilder.class, transfer.getClass());
        RequestBuilder<T> builder = builders.stream()
                .filter(b -> type.isInstance(b))
                .findFirst()
                .get();

        return builder.createRequest(transfer);
    }
}