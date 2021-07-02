package com.st.dynamic.service;

import com.st.dynamic.model.dto.BookDataDTO;
import com.st.dynamic.model.vo.PageQueryResponseVO;
import com.st.dynamic.model.vo.BooksDataQueryRspV0;

/**
 * author: pan haobo
 * data: 2021/7/2 11:07
 * description:
 */
public interface selectBookData {
    PageQueryResponseVO<BooksDataQueryRspV0> selectBookDataByCondition(BookDataDTO dto);
}
