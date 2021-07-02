package com.st.dynamic.model.vo;

import lombok.Data;

/**
 * author: pan haobo
 * data: 2021/7/1 15:57
 * description:
 */
@Data
public class BooksDataQueryRspV0 {
    private String id;//唯一标识Id
    private String isbn;//ISBN码
    private String name;//书名
    private String author;//作者
    private String publisher;//出版社
    private String publish_date;//出版日期
    private String author_loc;//作者loc
    private String suit;//ISBN码
    private String info;//书信息
    private String img_url;//相关图片链接
    private double old_price;//原价
    private double new_price;//现价
    private Integer category;
}
