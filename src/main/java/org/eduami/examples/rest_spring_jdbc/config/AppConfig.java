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
        dataSource.setUrl("jdbc:mysql://"+(System.getenv("CIS_MYSQL_PORT_3306_TCP_ADDR")==null?"localhost":System.getenv("CIS_MYSQL_PORT_3306_TCP_ADDR"))+"/cisdb");
        dataSource.setUsername("root");
        dataSource.setPassword(System.getenv("CIS_MYSQL_ENV_MYSQL_ROOT_PASSWORD")==null?"Test@123":System.getenv("CIS_MYSQL_ENV_MYSQL_ROOT_PASSWORD"));
        return dataSource;

    }
}  
