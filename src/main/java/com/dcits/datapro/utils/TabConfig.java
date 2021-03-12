package com.dcits.datapro.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * PackageName: com.dcits.datapro.utils
 * ClassName: TabConfig
 * Description:
 *
 * @Date: 2021/3/11 23:15
 * @Author:陈克齐
 */
@Component
@ConfigurationProperties(prefix = "table")
@PropertySource("classpath:application-tab.yml")
public class TabConfig implements Serializable {

    private List<String> tables;

    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }
}
