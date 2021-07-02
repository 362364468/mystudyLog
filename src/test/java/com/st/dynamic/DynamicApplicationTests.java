package com.st.dynamic;

import com.st.dynamic.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class DynamicApplicationTests {
    @Autowired
    private BookService bookService;
    @Test
    public void findBookList() {
        bookService.list().forEach(System.out::println);
    }
}
