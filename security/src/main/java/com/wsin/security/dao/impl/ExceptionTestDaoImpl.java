package com.wsin.security.dao.impl;

import org.springframework.stereotype.Repository;

import com.wsin.security.dao.ExceptionTestDao;
@Repository
public class ExceptionTestDaoImpl implements ExceptionTestDao{

	
	public void exception(Integer id) throws Exception {  
        switch(id) {  
        case 1:  
            throw new Exception("dao12");  
        case 2:  
            throw new Exception("dao22");  
        case 3:  
            throw new Exception("dao32");  
        case 4:  
            throw new Exception("dao42");  
        case 5:  
            throw new Exception("dao52");  
        default:  
            throw new Exception("Dao Parameter Error");  
        }  
    }  
	
	
}
