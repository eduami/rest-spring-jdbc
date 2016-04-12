package org.eduami.examples.rest_spring_jdbc.config;  
  
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
  
@Configuration 
@ComponentScan("org.eduami.examples.rest_spring_jdbc") 
@EnableWebMvc   
public class AppConfig {  
	@Bean
    public DataSource dataSource() {
    	BasicDataSource dataSource = new BasicDataSource(); // Create a connection pool
    	dataSource.setInitialSize(2); //set initial and max number of connections in pool 
        dataSource.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        dataSource.setUrl("jdbc:mysql://localhost/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("Test@123");
        return dataSource;

    }
}  
