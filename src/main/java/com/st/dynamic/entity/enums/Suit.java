package com.st.dynamic.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum Suit {
    YES(1,"是"),
    NO(2,"否")
    ;

    Suit(int code,String desc){
        this.code = code;
        this.desc = desc;
    }
    @EnumValue
    private final int code;
    private final String desc;
}
