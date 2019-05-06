package cn.com.mebatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * 全局配置对象
 * @author gaopengchao
 * 2019年5月6日
 */
public class MyConfiguration
{
    public static ResourceBundle sqlMappings;
    
    static 
    {
        sqlMappings = ResourceBundle.getBundle("sql");
        
    }
    
    public <T> T getMapper(Class<?> clazz,MySqlSession sqlSession)
    {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new MyMapperProxy(sqlSession));
    }
}
