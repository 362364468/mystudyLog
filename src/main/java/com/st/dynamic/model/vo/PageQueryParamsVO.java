package com.st.dynamic.model.vo;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: zhuml
 * @Date: 2019-08-13
 * @Time: 15:57
 * @Version: V_1.0
 */
@Data
public class PageQueryParamsVO implements Serializable {
    //当前页
    @NotNull(message = "当前页不能为空")
    private Integer pageCurrent;

    //当前页显示的条数
    @NotNull(message = "当前页显示的条数不能为空")
    private Integer pageSize;
}
