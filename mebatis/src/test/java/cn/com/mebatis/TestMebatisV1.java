package cn.com.mebatis;

import cn.com.mebatis.v1.MyConfiguration;
import cn.com.mebatis.v1.MyExecutor;
import cn.com.mebatis.v1.MySqlSession;
import cn.com.mebatis.v1.mapper.BlogMapper;

/**
 * @author gaopengchao
 * 2019年5月6日
 */
public class TestMebatisV1
{
    public static void main(String[] args)
    {
        MySqlSession sqlSession = new MySqlSession(new MyConfiguration(), new MyExecutor());
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.selectBlogById(1);
    }
}
