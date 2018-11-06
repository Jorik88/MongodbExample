package com.example.primary.repository;

import com.example.primary.TransactionItemMap;
import org.springframework.data.repository.CrudRepository;

public interface TransactionItemMapRepository extends CrudRepository<TransactionItemMap, String> {

    TransactionItemMap findByOrderId(String orderId);
}
