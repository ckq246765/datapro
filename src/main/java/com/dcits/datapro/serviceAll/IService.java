package com.dcits.datapro.serviceAll;

import java.util.List;

/**
 * 通用接口
 * @param <T>
 */
public interface IService<T> {
    T selectByKey(Object key);

    int save(T entity);

    int saveNotNull(T entity);

    int delete(Object key);

    int deleteByExample(Object example);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    List<T> selectAll();

    int selectCountByExample(Object example);

}
