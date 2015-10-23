package security;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 public static void main(String[] args) {
		         ClassPathXmlApplicationContext  cxt = new ClassPathXmlApplicationContext("applicationContext-context.xml");
		           cxt.getBean("");
	}

}
