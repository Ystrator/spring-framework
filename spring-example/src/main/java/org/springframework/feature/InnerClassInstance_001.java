package org.springframework.feature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 内部类的实例化测试
 * @since 2023年4月24日
 */
public class InnerClassInstance_001 {

	// 实例化是 innerClassInstance_001.InnerClass，所以在实际上他需要是一个InnerClassInstance_001的实例对象
	// 将InnerClass变成不是实例对象的成员
	class InnerClass {

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(InnerClass.class);
		context.refresh();
		System.out.println(context.getBean(InnerClass.class));
	}

}