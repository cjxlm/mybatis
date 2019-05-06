package cn.com.mebatis.v2.binding;

import java.lang.reflect.Proxy;

import cn.com.mebatis.v2.session.DefaultSqlSession;

/**
 * 用于产生MapperProxy代理类
 * @author gaopengchao
 * 2019年5月6日
 */
public class MapperProxyFactory
{
    private Class<?> mapperInterface;
    private Class<?> object;

    public MapperProxyFactory(Class<?> mapperInterface, Class<?> object) {
        this.mapperInterface = mapperInterface;
        this.object = object;
    }

    public <T> T newInstance(DefaultSqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[] { mapperInterface }, new MapperProxy(sqlSession, object));
    }
}
