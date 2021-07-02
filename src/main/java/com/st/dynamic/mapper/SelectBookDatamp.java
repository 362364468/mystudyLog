package com.st.dynamic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.dynamic.model.po.BookDataPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author: pan haobo
 * data: 2021/7/2 9:19
 * description:
 */
@Repository
public interface SelectBookDatamp extends BaseMapper<BookDataPO> {

    long selectBookDataByCondition(@Param("po") BookDataPO po);

    List<BookDataPO> queryBookDataByCondition(@Param("po") BookDataPO po);

}
