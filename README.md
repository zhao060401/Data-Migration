# Data-Migration
SpringBoot的多数据源配置，可以做两个表数据的迁移用
目前
spring.datasource.url 和spring.datasource2.url 两个数据源，generatorConfig.xml文件配置了mybatis自动生成的配置
com.huice.service.impl.UserServiceImpl#oldToNow 方法示例，查询一个库数据，切换，再插入。
