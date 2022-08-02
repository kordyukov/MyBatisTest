package com.example.test_hibernate.demo.repo;

import com.example.test_hibernate.demo.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface TestRepo  {
    List<Test> findAll();
}
