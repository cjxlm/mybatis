package cn.com.mebatis.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gaopengchao
 * 2019年5月6日
 */
public class MyMapperProxy implements InvocationHandler
{
    private MySqlSession sqlSession;
    
    public MyMapperProxy(MySqlSession sqlSession)
    {
        this.sqlSession = sqlSession;
    }
    
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        String interfaceName = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = interfaceName + "." + methodName;
        return sqlSession.selectOne(statementId,args[0]);
    }

}
