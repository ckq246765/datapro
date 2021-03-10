package com.dcits.datapro.web;

import com.dcits.datapro.businessService.ITestBusiness;
import com.dcits.datapro.entity.businessTest;
import com.dcits.datapro.entity.systemTest;
import com.dcits.datapro.systemService.ITestSystem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * PackageName: com.dcits.datapro.web
 * ClassName: TestController
 * Description:
 *
 * @Date: 2021/3/9 17:05
 * @Author:陈克齐
 */
@Api("测试")
@RestController
public class TestController {


    @Autowired
    private ITestBusiness iTestBusiness;
    @Autowired
    private ITestSystem iTestSystem;

    @ApiOperation("测试")
    @GetMapping("/index")
    public String test(){
        iTestBusiness.save(new businessTest("123","aaa",23));
        int i = 1/0;
        iTestSystem.save(new systemTest("456","bbb",24));
        return "index.html";
    }

}
