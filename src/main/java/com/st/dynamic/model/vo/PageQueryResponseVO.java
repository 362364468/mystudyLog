package com.st.dynamic.model.vo;

import com.baowei.utils.kit.Paginator;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: zhuml
 * @Date: 2019-08-13
 * @Time: 15:58
 * @Version: V_1.0
 */
@Data
public class PageQueryResponseVO<T> implements Serializable {

    //分页信息
    private Paginator paginator;

    //分页数据
    private List<T> list;

    public PageQueryResponseVO() {

    }

    public PageQueryResponseVO(Paginator paginator, List<T> list) {
        this.paginator = paginator;
        this.list = list;
    }
}
