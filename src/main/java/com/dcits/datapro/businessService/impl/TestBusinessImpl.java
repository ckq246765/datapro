package com.dcits.datapro.businessService.impl;

import com.dcits.datapro.businessDBMapper.businessTestMapper;
import com.dcits.datapro.businessService.ITestBusiness;
import com.dcits.datapro.entity.businessTest;
import com.dcits.datapro.serviceAll.impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestBusinessImpl extends BaseService<businessTest> implements ITestBusiness {

    @Autowired
    private businessTestMapper businessMapper;

    @Override
    public int save(businessTest business) {
        return super.save(business);
    }
}
