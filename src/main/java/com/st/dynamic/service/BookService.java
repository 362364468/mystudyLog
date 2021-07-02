package com.st.dynamic.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.dynamic.entity.Book;
import com.st.dynamic.mapper.BookMapper;
import org.springframework.stereotype.Service;

//图书业务层
@Service
public class BookService extends ServiceImpl<BookMapper,Book> {
}
