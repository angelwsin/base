package com.wsin.security.exception.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.wsin.security.defexception.BusinessException;
/**
 * 实现HandlerExceptionResolver 接口自定义异常处理器
 * @author angelwsin
 *
 */
//@Component
public class MyExceptionHandler implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		      Map<String,Object>  model = new HashMap<String,Object>();
		      model.put("ex", ex);
		        if(ex instanceof BusinessException){
		        	 return new ModelAndView("page/bussess", model);
		        }else{
		        	 return new ModelAndView("page/error", model);
		        }
	
	}

}
