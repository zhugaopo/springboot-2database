//package com.sunyard.bigdata.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(basePackages = "com.sunyard.bigdata.dao", sqlSessionFactoryRef = "courseSqlSessionFactory")
//public class CourseDbConfig {
//
//    @Bean(name = "courseDataSource")
//    @ConfigurationProperties(prefix = "courseDataSource")
//    @Primary
//    public DataSource courseDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    /**
//     * 数据源
//     * @param dataSource
//     * @return
//     * @throws Exception
//     */
//    @Bean(name = "courseSqlSessionFactory")
//    @Primary
//    public SqlSessionFactory courseSqlSessionFactory(@Qualifier("courseDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
//        return bean.getObject();
//    }
//
//}
