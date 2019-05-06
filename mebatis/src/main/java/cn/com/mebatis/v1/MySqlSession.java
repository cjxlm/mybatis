package cn.com.mebatis.v1;

/**
 * 会话
 * @author gaopengchao
 * 2019年5月6日
 */
public class MySqlSession
{
    private MyConfiguration configuration;
    
    private MyExecutor executor;
    
    public MySqlSession(MyConfiguration cfg,MyExecutor exce)
    {
        this.configuration = cfg;
        this.executor = exce;
    }

    public Object selectOne(String statementId, Object object)
    {
        String sql = MyConfiguration.sqlMappings.getString(statementId);
        return executor.query(sql,object);
    }
    
    public <T> T getMapper(Class<?> clazz){
        return configuration.getMapper(clazz, this);
    }
}
