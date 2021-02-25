package com.walter.dubbotest.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.walter.dubbotest.service.DataService;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: dubbotest
 * @Package: com.walter.dubbotest.service.impl
 * @Description: note
 * @Author: sunwh33441
 * @CreateDate: 2021/2/25 15:50
 * @UpdateUser: sunwh33441
 * @UpdateDate: 2021/2/25 15:50
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2021 Hundsun Technologies Inc. All Rights Reserved
 **/
@Service
@Component
public class DataServiceImpl implements DataService {
    @Override
    public int dataDeal() {
        return 0;
    }
}
