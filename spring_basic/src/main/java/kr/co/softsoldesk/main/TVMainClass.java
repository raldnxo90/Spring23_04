package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;
import kr.co.softsoldesk.beans.TV;

public class TVMainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//Spring 컨테이너 구동
		//AbstractApplicationContext : BeanFactory + ApplicationContext
		//GenericXmlApplicationContext : 파일과 클래스 관리 설정(xml)
		AbstractApplicationContext ctxx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//컨테이너로부터 필요한 객체를 요청
		TV tv = (TV)ctxx.getBean("TV1");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		ctxx.close();
		
		System.out.println("-----------------------------------------------");
		
		
		TV tv1 = (TV)ctx.getBean("TV1"); 
		TV tv2 = (TV)ctx.getBean("TV2"); 
		
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();

		
		System.out.println("-----------------");
		
		tv2.powerOn();
		tv2.powerOff();
		tv2.volumeUp();
		tv2.volumeDown();

	
		ctx.close();
		
		
		
	}
	
}

//ClassPathXmlApplicationContext: 인스턴스 변수(객체)를 편리하게 생성하는 클래스