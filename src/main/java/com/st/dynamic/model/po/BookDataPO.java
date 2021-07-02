package com.st.dynamic.model.po;

import lombok.Data;

/**
 * author: pan haobo
 * data: 2021/7/2 10:50
 * description:
 */
@Data
public class BookDataPO {
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

    private Integer pageCurrent;
    private Integer pageSize;
    private Integer startIndex;
    private Integer endIndex;
}
