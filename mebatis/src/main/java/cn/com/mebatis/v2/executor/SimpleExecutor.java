package cn.com.mebatis.v2.executor;


/**
 * @author gaopengchao
 * 2019年5月6日
 */
public class SimpleExecutor implements Executor
{
    @Override
    public <T> T query(String statement, Object[] parameter, Class<?> pojo)
    {
        StatementHandler statementHandler = new StatementHandler();
        return statementHandler.query(statement, parameter, pojo);
    }

}
