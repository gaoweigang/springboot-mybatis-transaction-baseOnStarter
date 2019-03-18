package com.gwg.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoweigang
 * 
 * 我们的Application类上使用的第一个注解是@RestController。这被称为一个构造型注解。
 * 它为阅读代码的人们提供建议。对于Spring,该类扮演了一个特殊角色。在本示例中，我们的
 * 类是一个web @Controller,所以当处理进来的web请求时，Spring会询问他.
 * 
 * @SpringBootApplication 等价于 @Configuration, @EnableAntoConfiguration 和 @ComponentScan。
 */
@RestController
@SpringBootApplication
@MapperScan("com.gwg.demo.mapper")
/**
 * 开启事物
 * 关于事务管理器，不管是JPA还是JDBC等都实现自接口 PlatformTransactionManager。
 *  如果你添加的是 spring-boot-starter-jdbc 依赖，框架会默认注入 DataSourceTransactionManager 实例
 *  如果你添加的是 spring-boot-starter-data-jpa 依赖，框架会默认注入 JpaTransactionManager 实例。
 */
//@EnableTransactionManagement  //使用EnableTransactionManagement注解后就可以使用Transactional注解开启事物
public class Application{
	
	/**
	 * @RequestMapping注解提供路由信息。它告诉Spring任何来自"/"路径的请求都应该被映射到home方法。
	 * 
	 * 在这里编写一个测试方法用于测试SpringBoot基础环境有没有配置好，可以在浏览器中输入http://localhost:8080/验证
	 */
	@RequestMapping("/")
	String home(){
		return "Hello World";
	}
		
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
	}

}
