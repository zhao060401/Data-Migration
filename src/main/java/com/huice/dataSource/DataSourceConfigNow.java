package com.huice.dataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@MapperScan(basePackages = "com.huice.dao.now", sqlSessionFactoryRef = "nowSqlSessionFactory")
public class DataSourceConfigNow {

    @Bean(name = "nowDataSource")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource getDateSource2() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "nowSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("nowDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "nowTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("nowDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "nowSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("nowSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
