package com.wsin.security.event;

import org.springframework.context.ApplicationEvent;

import com.wsin.security.bean.AbstractMessage;
/*
 * spring event
 * 事件

具体代表者是：ApplicationEvent：

1、其继承自JDK的EventObject，JDK要求所有事件将继承它，并通过source得到事件源，比如我们的AWT事件体系也是继承自它；

2、系统默认提供了如下ApplicationEvent事件实现：(见附件）
 */
@SuppressWarnings("serial")
public  class MessageEvent  extends ApplicationEvent{

	public MessageEvent(AbstractMessage source) {
		super(source);
		// TODO Auto-generated constructor stub
	}



}
