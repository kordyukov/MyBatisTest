package com.example.test_hibernate.demo.controler;

import com.example.test_hibernate.demo.entity.Test;
import com.example.test_hibernate.demo.repo.TestRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestPostgres {
    private final TestRepo testRepo;

    public TestPostgres(TestRepo testRepo) {
        this.testRepo = testRepo;
    }


    @GetMapping("/all")
    public List<Test>getAll(){
      return testRepo.findAll();
    }


}
