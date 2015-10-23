package com.wsin.security.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wsin.security.defexception.BusinessException;

public class BaseController {
	 /** 基于@ExceptionHandler异常处理 */  
    @ExceptionHandler  
    public String exp(HttpServletRequest request, HttpServletResponse response,Exception ex) {  
        request.setAttribute("ex", ex);  
        // 根据不同错误转向不同页面  
        if(ex instanceof BusinessException) {  
        	try {
        		response.setContentType("text/html; charset=utf-8");
				response.getWriter().write(ex.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return  null;  
        }else {  
            return "page/error";  
        }  
    }  
}
