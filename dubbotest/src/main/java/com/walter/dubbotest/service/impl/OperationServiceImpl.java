package com.walter.dubbotest.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.walter.dubbotest.service.OperationService;

@Service
@Component
public class OperationServiceImpl implements OperationService {
    @Override
    public int operationDeal() {
        return 0;
    }
}
