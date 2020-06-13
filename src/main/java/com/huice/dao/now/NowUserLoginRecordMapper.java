package com.huice.dao.now;

import com.huice.model.now.NowUserLoginRecord;

public interface NowUserLoginRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NowUserLoginRecord record);

    int insertSelective(NowUserLoginRecord record);

    NowUserLoginRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NowUserLoginRecord record);

    int updateByPrimaryKey(NowUserLoginRecord record);
}