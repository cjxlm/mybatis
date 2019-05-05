package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.entity.Blog;

/**
 * 博客
 * @author gaopengchao
 * 2019年5月5日
 */
public interface BlogMapper {
    
    /**
     * 文章列表翻页查询
     * @param rowBounds
     * @return
     */
    public List<Blog> selectBlogList(RowBounds rowBounds);
}
