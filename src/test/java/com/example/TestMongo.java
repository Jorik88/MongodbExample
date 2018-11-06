package com.example;

import com.example.primary.TransactionItemMap;
import com.example.primary.repository.TransactionItemMapRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMongo {

    @Autowired
    private TransactionItemMapRepository repository;


    @Test
    public void test() {
        TransactionItemMap byOrderId = repository.findByOrderId("14");
        System.out.println(byOrderId);
    }
}
