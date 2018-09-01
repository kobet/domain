//package com.domain.achilles.config;
//
//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@MapperScan("com.domain.achilles..**.mapper")
//public class MybatisConfig implements TransactionManagementConfigurer {
//
//
//    @Autowired
//    private MybatisProperties mybatisProperties;
//
//    /**
//     * 配置dataSource，使用Druid连接池
//     */
//    @Bean(destroyMethod = "close", initMethod = "init")
//    @ConfigurationProperties("spring.datasource.druid")
//    public DataSource dataSource() {
//        return DruidDataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource());
//        try {
//            org.apache.ibatis.session.Configuration configuration = mybatisProperties.getConfiguration();
//            PathMatchingResourcePatternResolver pathMatchResolver = new PathMatchingResourcePatternResolver();
//            Resource[] mapperLocations = pathMatchResolver.getResources("classpath*:mybatis/mapper/**/*.xml");
//            //指定mapper xml目录
//            bean.setMapperLocations(mapperLocations);
//            //设置配置
//            bean.setConfiguration(configuration);
//            return bean.getObject();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * Transaction 相关配置
//     * 因为有两个数据源，所有使用ChainedTransactionManager把两个DataSourceTransactionManager包括在一起。
//     */
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource());
//        return transactionManager;
//    }
//
//}
