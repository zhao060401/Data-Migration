package com.huice.dao.old;

import com.huice.model.old.OldUser;

import java.util.List;

public interface OldUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(OldUser record);

    int insertSelective(OldUser record);

    OldUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(OldUser record);

    int updateByPrimaryKey(OldUser record);
    List<OldUser> selectAll();
    int insertBatch(List<OldUser> list);
}