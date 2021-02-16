package com.german.spring.clientes.back.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class RootConfig {

	@Value("${datasource.url}")
    private String url;
    
    @Value("${datasource.username}")
    private String username;
    
    @Value("${datasource.password}")
    private String password;
    
    @Value("${datasource.driver}")
    private String driver;
	
    /**
     * @return DataSource
     */    
	@Bean
	@Primary
    public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);

		return dataSource;
    }
	
    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();        
        sessionFactory.setDataSource(dataSource());
        
        SqlSessionFactory session = sessionFactory.getObject();
        
        session.getConfiguration().setMapUnderscoreToCamelCase(true);
               
        return session;
    }
}
