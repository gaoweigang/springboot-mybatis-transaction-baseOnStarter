package com.gwg.demo.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * Druid和Mybatis都是基于Starter,所以只需要简单配置下yml文件即可
 * MyBatis基础配置
 * @author Administrator
 *
 */
@Configuration
//@EnableTransactionManagement
public class DataSourceConfig{
	
	/**
	 * 
	 * @Title: 生成一个名字为  dataSource的bean
	 * @Description: 数据源的配置  
	 * @param: @return      
	 * @return: DataSource      
	 * @throws
	 */
	/*@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DruidDataSource();
	}*/
	
	/**
	 * 生成一个名字为 sqlSessionFactory 的bean
	 * mybatis的sqlSessionFactory配置
	 * @param dataSource
	 */
	/*@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
    	SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    	bean.setDataSource(dataSource);
    	bean.setTypeAliasesPackage("com.gwg.demo.model");
    	
    	ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(); 
    	try {
			bean.setMapperLocations(resolver.getResources("classpath*:com/gwg/demo/mapper/*.xml"));
		} catch (IOException e) {
			e.printStackTrace();	
		}
    	return bean.getObject();
    }*/
	
    
 /*   @Bean
    public SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
    	return new SqlSessionTemplate(sqlSessionFactory);
    }
    */
	
	/**
	 * 生成一个名字为mapperScannerConfigurer的bean
	 * mapper接口扫描包
	 */
  /*  @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		configurer.setBasePackage("com.gwg.demo.mapper");
		return configurer;
	}*/
	
    
    /**
	 * 该配置等价于@EnableTransactionManagement,该注解会生成一个事物管理器，有了事物管理器就可以使用@Transactional注解
	 * @Title: transactionManager   
	 * @Description: 配置事务管理器
	 * @param: @param dataSource
	 * @return: DataSourceTransactionManager      
	 */
	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource)
			throws Exception {
		return new DataSourceTransactionManager(dataSource);
	}

}
