package com.walter.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.walter.provider.service.ProviderService;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: provider
 * @Package: com.walter.provider.service.impl
 * @Description: note
 * @Author: sunwh33441
 * @CreateDate: 2021/3/1 12:24
 * @UpdateUser: sunwh33441
 * @UpdateDate: 2021/3/1 12:24
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2021 Hundsun Technologies Inc. All Rights Reserved
 **/
@Service
@Component
public class ProviderServiceImpl implements ProviderService {

    @Override
    public int providId() {
        return 1234;
    }
}
