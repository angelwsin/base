package com.wsin.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsin.security.dao.ExceptionTestDao;
import com.wsin.security.defexception.BusinessException;
import com.wsin.security.service.ExceptionTestService;

@Service
public class ExceptionTestServiceImpl implements ExceptionTestService{
        @Autowired
	    private  ExceptionTestDao exceptionTestDao;
	public void dao(Integer id) throws Exception {
		// TODO Auto-generated method stub
		exceptionTestDao.exception(id);
	}
	
	 public void exception(Integer id) throws Exception {  
	        switch(id) {  
	        case 1:  
	            throw new Exception("service11");  
	        case 2:  
	            throw new Exception( "service21");  
	        case 3:  
	            throw new BusinessException("service","service31");  
	        case 4:  
	            throw new Exception( "service41");  
	        case 5:  
	            throw new Exception( "service51");  
	        default:  
	            throw new Exception("Service Parameter Error");  
	        }  
	    }  

}
