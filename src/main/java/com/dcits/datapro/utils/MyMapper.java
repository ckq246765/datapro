package com.dcits.datapro.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * PackageName: com.dcits.datapro.utils
 * ClassName: MyMapper
 * Description:
 *
 * @Date: 2021/3/9 15:35
 * @Author:陈克齐
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
