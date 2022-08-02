package com.example.test_hibernate.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@RequiredArgsConstructor
@Data
public class Test {
        private final String id;
        private final String name;
        private final String fio;

}
