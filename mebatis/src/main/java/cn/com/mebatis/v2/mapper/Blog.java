package cn.com.mebatis.v2.mapper;

import lombok.Data;

@Data
public class Blog{
    Integer bid; // 文章ID
    String name; // 文章标题
    Integer authorId; // 文章作者ID
}
