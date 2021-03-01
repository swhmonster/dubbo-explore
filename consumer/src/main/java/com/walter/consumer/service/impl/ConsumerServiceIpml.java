package com.walter.consumer.service.impl;

import org.apache.dubbo.config.annotation.Reference;

import com.walter.consumer.service.ConsumerService;
import com.walter.provider.service.ProviderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: consumer
 * @Package: com.walter.consumer.service.impl
 * @Description: note
 * @Author: sunwh33441
 * @CreateDate: 2021/3/1 12:22
 * @UpdateUser: sunwh33441
 * @UpdateDate: 2021/3/1 12:22
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2021 Hundsun Technologies Inc. All Rights Reserved
 **/
@Slf4j
public class ConsumerServiceIpml implements ConsumerService {

    @Reference
    private ProviderService providerService;

    @Override
    public int consume() {
        log.debug("provider response:{}", providerService.providId());
        return providerService.providId();
    }
}
