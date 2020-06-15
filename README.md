# Data-Migration
SpringBoot的多数据源配置，可以做两个表数据的迁移用
## 目前
spring.datasource.url 和spring.datasource2.url 两个数据源，generatorConfig.xml文件配置了mybatis自动生成的配置
com.huice.service.impl.UserServiceImpl#oldToNow 方法示例，查询一个库数据，切换，再插入。

自动切换数据源在DataSourceConfig和DataSourceConfigNow两个类中配置
通过扫描不同包下的DAO层，注入不同DataSource

##关于注解的说明：
###@Primary 
表示如果在多个同类 Bean 候选时，该 Bean 优先被考虑。「多数据源配置的时候注意，必须要有一个主数据源，用 @Primary 标志该 Bean」
###@MapperScan
1. 扫描 Mapper 接口并容器管理，包路径精确到 test1，为了和下面 test2数据源做到精确区分
2. 该注解需要修改sqlSessionFactoryRef或者sqlSessionTemplateRef，我上面的代码修改的是sqlSessionTemplateRef
3. 该注解指明了扫描dao层，并且给dao层注入指定的SqlSessionTemplate。所有@Bean都需要按照命名指定正确。
###@Value 
获取全局配置文件 application.properties 的 key-value 配置,并自动装配
sqlSessionFactoryRef 表示定义了 key ，表示一个唯一 SqlSessionFactory 实例。SqlSessionFactory 官方说明 http://mybatis.org/spring/zh/sqlsession.html
