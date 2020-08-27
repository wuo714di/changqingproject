package com.cq.dao;




import com.cq.commonEntity.BaseDao;
import com.cq.entity.AccountEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author changqing
 * @date 2020-07-14 13:50
 * @description:
 */
@Mapper
public interface AccountDao extends BaseDao<AccountEntity> {

}
