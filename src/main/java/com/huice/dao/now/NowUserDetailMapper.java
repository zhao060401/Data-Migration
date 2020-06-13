package com.huice.dao.now;

import com.huice.model.now.NowUserDetail;

public interface NowUserDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NowUserDetail record);

    int insertSelective(NowUserDetail record);

    NowUserDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NowUserDetail record);

    int updateByPrimaryKey(NowUserDetail record);
}