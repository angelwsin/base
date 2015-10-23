package com.wsin.security.defexception;

@SuppressWarnings("serial")
public class BusinessException extends Exception{

	          private String desc;

			public String getDesc() {
				return desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			public BusinessException(String desc,String message) {
				super(message);
				this.desc = desc;
			}
	       
}
