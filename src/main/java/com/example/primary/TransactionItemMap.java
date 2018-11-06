package com.example.primary;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "transactionItemMap")
public class TransactionItemMap {

    @Id
    private String id;
    private String transactionId;
    private String orderId;
    private Long createdDate;
}
