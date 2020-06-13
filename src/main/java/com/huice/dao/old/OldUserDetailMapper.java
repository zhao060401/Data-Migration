package com.huice.dao.old;

import com.huice.model.old.OldUserDetail;

public interface OldUserDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OldUserDetail record);

    int insertSelective(OldUserDetail record);

    OldUserDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OldUserDetail record);

    int updateByPrimaryKey(OldUserDetail record);
}