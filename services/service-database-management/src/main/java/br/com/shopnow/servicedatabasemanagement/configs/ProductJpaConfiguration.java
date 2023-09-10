package br.com.shopnow.servicedatabasemanagement.configs;

import br.com.shopnow.servicedatabasemanagement.modals.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackageClasses = Product.class,
        entityManagerFactoryRef = "productEntityManagerFactory",
        transactionManagerRef = "productTransactionManager")
public class ProductJpaConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean productEntityManagerFactory(@Qualifier("productDataSource") DataSource dataSource, EntityManagerFactoryBuilder builder){
        return builder
                .dataSource(dataSource)
                .packages(Product.class)
                .build();
    }

    @Bean
    public PlatformTransactionManager productTransactionManager(@Qualifier("productEntityManagerFactory") LocalContainerEntityManagerFactoryBean productEntityManagerFactory){
        return new JpaTransactionManager(Objects.requireNonNull(productEntityManagerFactory.getObject()));
    }

}
