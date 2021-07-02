package com.st.dynamic.service;

import com.baowei.utils.kit.EntityUtils;
import com.baowei.utils.kit.Paginator;
import com.st.dynamic.model.po.BookDataPO;
import com.st.dynamic.model.dto.BookDataDTO;
import com.st.dynamic.model.vo.BooksDataQueryRspV0;
import com.st.dynamic.model.vo.PageQueryResponseVO;
import com.st.dynamic.service.selectBookData;
import com.st.dynamic.mapper.SelectBookDatamp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * author: pan haobo
 * data: 2021/7/2 9:31
 * description:
 */

@Service
public class selectBookDataIm implements selectBookData{
    private final SelectBookDatamp SBookDatamp;

    public selectBookDataIm(SelectBookDatamp SBookDatamp){
        this.SBookDatamp = SBookDatamp;
    };

    @Override
    public PageQueryResponseVO<BooksDataQueryRspV0> selectBookDataByCondition(BookDataDTO dto){
        BookDataPO po = EntityUtils.copy(dto,BookDataPO.class);
        long totalRecords = SBookDatamp.selectBookDataByCondition(po);
        Paginator paginator = new Paginator(dto.getPageCurrent(), dto.getPageSize(), totalRecords);
        List<BooksDataQueryRspV0> list =new ArrayList<>();
        if(totalRecords > 0){
            po.setStartIndex(paginator.getStartIndex());
            po.setEndIndex(paginator.getEndIndex());
            List<BookDataPO> data = SBookDatamp.queryBookDataByCondition(po);
            data.forEach(obj -> list.add(EntityUtils.copy(obj, BooksDataQueryRspV0.class)));
        }
        return new PageQueryResponseVO<>(paginator, list);
    }
}
