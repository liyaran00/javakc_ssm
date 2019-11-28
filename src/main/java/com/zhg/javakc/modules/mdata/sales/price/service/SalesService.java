package com.zhg.javakc.modules.mdata.sales.price.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.mdata.sales.price.dao.SalesDao;
import com.zhg.javakc.modules.mdata.sales.price.entity.SalesEntity;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/19 14:58
 */
@Service
public class SalesService extends BaseService<SalesDao, SalesEntity> {

    /**
     * 【测试管理】条件分页查询
     * @param entity
     * @param page
     * @return 数据和分页信息
     */
    public Page<SalesEntity> queryPrice(SalesEntity entity, Page<SalesEntity> page){
        //设置分页参数，才会被Mybatis分页插件所识别，拦截SQL，再加入分页SQL语句
        entity.setPage(page);
        //根据分页与查询条件进行测试数据的查询,再将list结果集放入分页，返回给页面
        page.setList(dao.findList(entity));
        return page;
    }
}
