package com.dcits.datapro.conf;

import com.dcits.datapro.utils.MyMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;



/**
 * PackageName: com.dcits.datapro.conf
 * ClassName: MybatisBusinessDBDatasourceConfig
 * Description:
 *
 * @Date: 2021/3/9 15:51
 * @Author:陈克齐
 */
@Configuration
//精确到 mapper 目录，以便跟其他数据源隔
@MapperScan(basePackages="com.dcits.datapro.businessDBMapper", markerInterface = MyMapper.class, sqlSessionFactoryRef = "sqlSessionFactory2")
public class MybatisBusinessDBDatasourceConfig {
    @Autowired
    @Qualifier("businessDataSource")
    private DataSource ds;

    @Bean
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(ds);
        //指定mapper xml目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:businessDBMapper/*.xml"));
        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        // 使用上面配置的Factory
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory2());
        return template;
    }
}
