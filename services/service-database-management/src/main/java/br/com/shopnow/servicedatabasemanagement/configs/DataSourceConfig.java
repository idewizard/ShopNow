package br.com.shopnow.servicedatabasemanagement.configs;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.product")
    public DataSourceProperties productDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource productDataSource(){
        return productDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.product")
    public DataSourceProperties invoiceDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource invoiceDataSource(){
        return invoiceDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

}
