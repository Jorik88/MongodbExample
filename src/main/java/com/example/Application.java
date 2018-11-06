package com.example;

import com.example.primary.TransactionItemMap;
import com.example.primary.repository.TransactionItemMapRepository;
import com.example.secondary.Customer;
import com.example.secondary.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private TransactionItemMapRepository repositoryMap;


    @Override
    public void run(String... args) {

//        repository.deleteAll();

        Customer first = new Customer();
        first.setFirstName("Ann");
        first.setLastName("Smith");
        Customer second = new Customer();
        second.setFirstName("Bob");
        second.setLastName("Vein");
        repository.save(first);
        repository.save(second);

        for(Customer customer : repository.findAll()) {
            System.out.println(customer);
        }

        System.out.println(repository.findByLastName("Vein"));
        System.out.println(repository.findByFirstName("Ann"));

        TransactionItemMap transactionItemMap = new TransactionItemMap();
        transactionItemMap.setOrderId("15");
        transactionItemMap.setTransactionId("12");
        transactionItemMap.setCreatedDate(System.currentTimeMillis());
        repositoryMap.save(transactionItemMap);

        Iterable<TransactionItemMap> all = repositoryMap.findAll();
        System.out.println(all);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
