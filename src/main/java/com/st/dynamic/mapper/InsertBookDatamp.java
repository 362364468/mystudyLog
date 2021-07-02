package com.st.dynamic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.dynamic.model.po.BookDataPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author: pan haobo
 * data: 2021/7/2 9:20
 * description:
 */
@Repository
public interface InsertBookDatamp extends BaseMapper<BookDataPO> {

    int insertBookData(@Param("list") List<BookDataPO> list);

}
