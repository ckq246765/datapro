package com.dcits.datapro.utils;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * PackageName: com.dcits.datapro.utils
 * ClassName: R
 * Description:
 *  统一返回接口：
 * @Date: 2021/3/10 21:47
 * @Author:陈克齐
 */
public class R {

    @ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private Map<String,Object> data = new HashMap<>();

    private R (){}

    /**
     * 返回成功
     * @return
     */
    public static R success(){
        return new R().setSuccess(true).setCode(ExceptionResultCode.SUCCESS).setMessage("成功");
    }

    /**
     * 返回失败
     * @return
     */
    public static R error(){
        return new R().setSuccess(false).setCode(ExceptionResultCode.ERROR).setMessage("失败");
    }

    public Boolean getSuccess() {
        return success;
    }

    public R setSuccess(Boolean success) {
        this.success = StringUtils.isEmpty(success)?this.success:success;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public R setCode(Integer code) {
        this.code = StringUtils.isEmpty(code)?this.code:code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public R setMessage(String message) {
        this.message = StringUtils.isEmpty(message)?this.message:message;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public R setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

}
