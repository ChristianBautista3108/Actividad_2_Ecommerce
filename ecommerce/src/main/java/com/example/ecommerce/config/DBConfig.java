package com.example.ecommerce.config;

import com.example.ecommerce.dao.IProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DBConfig {
    @Bean
    @Primary
    public IProductoDAO configureAdapterDB(@Autowired IProductoDAO mysqlDAO, @Autowired IProductoDAO oracleDAO){
        String dbType = "MySQL";
        if("MySQL".equalsIgnoreCase(dbType)){
            return mysqlDAO;
        } else {
            return oracleDAO;
        }
    }
}
