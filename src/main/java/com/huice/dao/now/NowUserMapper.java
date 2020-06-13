package com.huice.dao.now;

import com.huice.model.now.NowUser;

public interface NowUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(NowUser record);

    int insertSelective(NowUser record);

    NowUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(NowUser record);

    int updateByPrimaryKey(NowUser record);
}