package org.springframework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.abc.BeanTest;

/**
 * 新建model，开始第一个spring module测试
 * @author jiangxinxin@leoao.com
 * @since 2023年4月20日
 */
public class OneBotTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanTest.class);
		context.refresh();
		System.out.println(context.getBean(BeanTest.class));
	}


}
