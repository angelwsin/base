package com.wsin.security.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.wsin.security.bean.AbstractMessage;
import com.wsin.security.event.MessageEvent;
/*
 * 定义无序监听器
 */
@Component
public class TextMessageListener implements ApplicationListener<MessageEvent>{

	public void onApplicationEvent(MessageEvent event) {
		// TODO Auto-generated method stub
		  AbstractMessage msg = (AbstractMessage) event.getSource();
		  System.out.println(msg.getToUserName());
	}

}
