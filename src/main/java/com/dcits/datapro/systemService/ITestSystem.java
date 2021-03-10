package com.dcits.datapro.systemService;

import com.dcits.datapro.entity.systemTest;
import com.dcits.datapro.serviceAll.IService;

public interface ITestSystem extends IService<systemTest> {

    public int save(systemTest systemTest);

}
