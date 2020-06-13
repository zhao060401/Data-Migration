package com.huice.dao.old;

import com.huice.model.old.OldUserLoginRecord;

public interface OldUserLoginRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OldUserLoginRecord record);

    int insertSelective(OldUserLoginRecord record);

    OldUserLoginRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OldUserLoginRecord record);

    int updateByPrimaryKey(OldUserLoginRecord record);
}