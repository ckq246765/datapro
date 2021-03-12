package com.dcits.datapro.exception;

import com.dcits.datapro.utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(MyException.class)
    public R myException(HttpServletRequest request,MyException e){
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("Exception",e.getMessage());
       map.put("Url",request.getRequestURL());

       return R.error().setData(map);
    }

    @ExceptionHandler(RuntimeException.class)
    public R runtimeException(HttpServletRequest request,RuntimeException e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("Exception",e.getMessage());
        map.put("Url",request.getRequestURL());

        return R.error().setData(map);
    }

    @ExceptionHandler(value = Exception.class)
    public R defaultErrorHandler(HttpServletRequest request, Exception e) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("Exception",e.getMessage());
        map.put("Url",request.getRequestURL());

        return R.error().setData(map);
    }
}
