package com.wsin.security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsin.security.service.ExceptionTestService;

/*
 * springMvc 异常处理方式一
 * （1）使用Spring MVC提供的简单异常处理器SimpleMappingExceptionResolver； 
 */
@Controller
@RequestMapping("/exp")
public class ExceptionTestController2 extends BaseController{
              @Autowired
	             private ExceptionTestService exceptionTestService;
	               @RequestMapping("/{who}/{id}")
	               public void  exception(@PathVariable("who") String who,@PathVariable("id") int id)throws Exception{
	            	          if("service".equals(who)) {
	            	        	  exceptionTestService.exception(id);
	            	          }else if("dao".equals(who)){
	            	        	  exceptionTestService.dao(id);
	            	          }
	            	   
	               }
	
}
