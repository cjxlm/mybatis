package cn.com;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.com.mapper.BlogMapper;

/**
 * 测试类
 * @author gaopengchao
 * 2019年5月5日
 */
public class PageInterceptorTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void prepare() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    /**
     * 要先在配置文件中开启插件
     */
    @Test
    public void testPlugin() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            int start = 0; // offset
            int pageSize = 5; // limit
            RowBounds rb = new RowBounds(start, pageSize);
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            mapper.selectBlogList(rb);
        } finally {
            session.close();
        }
    }
}
