package cn.com.mebatis.v2.mapper;

import cn.com.mebatis.v2.annotation.Entity;
import cn.com.mebatis.v2.annotation.Select;

@Entity(Blog.class)
public interface BlogMapper {
    /**
     * 根据主键查询文章
     * @param bid
     * @return
     */
    @Select("select * from blog where bid = ?")
    public Blog selectBlogById(Integer bid);

}
