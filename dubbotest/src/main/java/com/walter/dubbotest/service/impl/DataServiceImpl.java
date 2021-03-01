package com.walter.dubbotest.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.walter.dubbotest.service.DataService;

@Service
@Component
public class DataServiceImpl implements DataService {
    @Override
    public int dataDeal() {
        return 0;
    }
}
