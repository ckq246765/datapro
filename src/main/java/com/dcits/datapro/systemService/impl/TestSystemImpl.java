package com.dcits.datapro.systemService.impl;

import com.dcits.datapro.entity.systemTest;
import com.dcits.datapro.serviceAll.impl.BaseService;
import com.dcits.datapro.systemDBMapper.systemTestMapper;
import com.dcits.datapro.systemService.ITestSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSystemImpl extends BaseService<systemTest> implements ITestSystem {

    @Autowired
    private systemTestMapper systemMapper;

    @Override
    public int save(systemTest system) {
        return super.save(system);
    }
}
