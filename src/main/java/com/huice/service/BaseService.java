package com.huice.service;

import com.huice.dataSource.DataSourceConfig;
import com.huice.dataSource.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService extends DataSourceType {
    @Autowired
    public DataSourceConfig dataSourceConfig;

    public void dbOld(){
        super.setDataBaseType(DataBaseType.OLD);
    }

    public void dbNow(){
        super.setDataBaseType(DataBaseType.NOW);
    }
}
