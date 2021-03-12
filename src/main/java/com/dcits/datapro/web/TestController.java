package com.dcits.datapro.web;

import com.dcits.datapro.businessService.ITestBusiness;
import com.dcits.datapro.entity.businessTest;
import com.dcits.datapro.entity.systemTest;
import com.dcits.datapro.exception.MyException;
import com.dcits.datapro.systemService.ITestSystem;
import com.dcits.datapro.utils.ExceptionResultCode;
import com.dcits.datapro.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * PackageName: com.dcits.datapro.web
 * ClassName: TestController
 * Description:
 *
 * @Date: 2021/3/9 17:05
 * @Author:陈克齐
 */
@Api(description = "测试类")
@RestController
public class TestController {


    @Autowired
    private ITestBusiness iTestBusiness;
    @Autowired
    private ITestSystem iTestSystem;

    @ApiOperation("测试方法")
    @PostMapping("/index")
    public R test(@RequestBody businessTest business) throws Exception {
        try {
            iTestBusiness.save(business);
            iTestSystem.save(new systemTest("1223","bbb",24));
        }catch (Exception e){

            throw new Exception("123");
        }
        return R.success();
    }

}
