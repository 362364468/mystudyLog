package com.st.dynamic.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;
//图书类型枚举类
@Getter
public enum Category {
    SELECTED(1,"精选图书"),RECOMMEND(2,"推荐图书"),BAGIN(3,"特价图书");
    Category(int code ,String desc){
        this.code = code;
        this.desc = desc;
    }
    @EnumValue//标记数据库库存的信息code
    private final int code;
    private final String desc;
}
