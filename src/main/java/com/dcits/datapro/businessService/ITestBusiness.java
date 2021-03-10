package com.dcits.datapro.businessService;

import com.dcits.datapro.entity.businessTest;
import com.dcits.datapro.serviceAll.IService;

public interface ITestBusiness extends IService<businessTest> {

    public int save(businessTest business);

}
