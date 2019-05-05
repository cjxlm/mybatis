package cn.com.entity;

import lombok.Data;

/**
 * 博客
 * @author gaopengchao
 * 2019年5月5日
 */
@Data
public class Blog
{
    Integer bid; // 文章ID
    String name; // 文章标题
    Integer authorId; // 文章作者ID
}
