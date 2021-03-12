package com.dcits.datapro.exception;

/**
 * 自定义异常处理类：
 */
public class MyException extends RuntimeException {
    /**
     * 状态码:
     */
    private Integer code;
    /**
     * 消息提示:
     */
    private String message;

    public MyException(){}

    public MyException(String message){
        this.message = message;
    }

    public MyException(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
