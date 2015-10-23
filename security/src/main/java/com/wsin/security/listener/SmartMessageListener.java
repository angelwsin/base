package com.wsin.security.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

import com.wsin.security.bean.AbstractMessage;
import com.wsin.security.event.MessageEvent;
/*
 *     supportsEventType：用于指定支持的事件类型，只有支持的才调用onApplicationEvent；
    supportsSourceType：支持的目标类型，只有支持的才调用onApplicationEvent；
    getOrder：即顺序，越小优先级越高
 */
@Component
public class SmartMessageListener implements SmartApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		// TODO Auto-generated method stub
		return eventType==MessageEvent.class;
	}

	public boolean supportsSourceType(Class<?> sourceType) {
		// TODO Auto-generated method stub
		return sourceType==AbstractMessage.class;
	}

}
