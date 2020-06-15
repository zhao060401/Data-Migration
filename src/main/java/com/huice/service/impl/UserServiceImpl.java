package com.huice.service.impl;

import com.github.pagehelper.PageHelper;
import com.huice.dao.now.NowUserMapper;
import com.huice.dao.old.OldUserMapper;
import com.huice.model.now.NowUser;
import com.huice.model.old.OldUser;
import com.huice.service.BaseService;
import com.huice.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service("iUserService")
public class UserServiceImpl extends BaseService implements IUserService {
    @Autowired
    private OldUserMapper oldUserMapper;

    @Autowired
    private NowUserMapper nowUserMapper;
    @Override
    public OldUser selectAll() {
        OldUser user = oldUserMapper.selectByPrimaryKey(134);
        System.out.println(user.toString());
        dbNow();
        NowUser nowUser = nowUserMapper.selectByPrimaryKey(1);
        System.out.println(nowUser.toString());
        return user;

    }

    @Override
    public void oldToNow() {
        PageHelper.startPage(1,20);
        List<OldUser> oldUsers = oldUserMapper.selectAll();
        List<NowUser> nowList=new ArrayList<NowUser>();
        log.info("查询旧数据");
        for (OldUser user:oldUsers) {
            NowUser nowUser=new NowUser();
            BeanUtils.copyProperties(user,nowUser);
            nowUser.setIsDelete(user.getDelFlag());
            nowUser.setDeleteTime(user.getDelTime());
            nowUser.setInvitationCode("");
            nowList.add(nowUser);
        }
        log.info("插入新数据");
        for (NowUser user:nowList) {
            int insert = nowUserMapper.insert(user);
        }

    }
}
