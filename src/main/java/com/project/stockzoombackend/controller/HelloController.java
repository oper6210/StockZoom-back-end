package com.project.stockzoombackend.controller;

import com.project.stockzoombackend.domain.entity.TestEntity;
import com.project.stockzoombackend.domain.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.ArrayList;

@Controller
@AllArgsConstructor
public class HelloController {

    private TestRepository dbTest;

    @ResponseBody
    @GetMapping("/db/test")
    public Iterable<TestEntity> testTable(){
        return  dbTest.findAll();
    }

    @ResponseBody
    @GetMapping("/db/test2")
    public List<TestEntity> listAllTable() {
        List<TestEntity> list = new ArrayList<>();
        Iterable<TestEntity> iterable = dbTest.findAll();
        for (TestEntity testEntity : iterable) {
            list.add(testEntity);
        }
        return list;
    }
}
