package cn.com.mebatis.v2.session;

/**
 * 会话工厂类，用于解析配置文件，产生SqlSession
 * @author gaopengchao
 * 2019年5月6日
 */
public class SqlSessionFactory
{
    private Configuration configuration;
    
    public SqlSessionFactory build()
    {
        configuration = new Configuration();
        return this;
    }
    
    public SqlSession openSession() 
    {
        return new DefaultSqlSession();
    }
}
