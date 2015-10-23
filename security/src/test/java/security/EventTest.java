package security;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.wsin.security.bean.TextMessage;
import com.wsin.security.event.TextMessageEvent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-context.xml")
@TransactionConfiguration(defaultRollback=false)
public class EventTest {
	 @Autowired  
	    private ApplicationContext applicationContext; 
	 @org.junit.Test
             public void evnet(){
            	 TextMessage msg = new TextMessage();
               msg.setContent("");
               msg.setFromUserName("zhangsan");
               msg.setToUserName("touserName");
           	 applicationContext.publishEvent(new TextMessageEvent(msg));
             }
	 
	 /*
	  * 1、ApplicationContext接口继承了ApplicationEventPublisher，并在AbstractApplicationContext实现了具体代码，实际执行是委托给ApplicationEventMulticaster（可以认为是多播）：
	  *  

2、ApplicationContext自动到本地容器里找一个名字为”“的ApplicationEventMulticaster实现，如果没有自己new一个SimpleApplicationEventMulticaster。
它就可以异步支持发布事件了
所以我们发送事件只需要通过ApplicationContext.publishEvent即可，没必要再创建自己的实现了
	  */
}
