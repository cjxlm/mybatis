package cn.com.mebatis;

import cn.com.mebatis.v2.mapper.BlogMapper;
import cn.com.mebatis.v2.mapper.Blog;
import cn.com.mebatis.v2.session.DefaultSqlSession;
import cn.com.mebatis.v2.session.SqlSessionFactory;

/**
 * @author gaopengchao
 * 2019年5月6日
 */
public class TestMebatisV2
{
    public static void main(String[] args)
    {
        SqlSessionFactory factory = new SqlSessionFactory();
        DefaultSqlSession sqlSession = factory.build().openSession();
        // 获取MapperProxy代理
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.selectBlogById(1);

        System.out.println("第一次查询: " + blog);
        System.out.println();
        blog = mapper.selectBlogById(1);
        System.out.println("第二次查询: " + blog);
    }
}
