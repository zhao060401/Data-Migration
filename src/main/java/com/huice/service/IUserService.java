package com.huice.service;

import com.huice.model.old.OldUser;


public interface IUserService {
    public OldUser selectAll();
    public void oldToNow();
}
