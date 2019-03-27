package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.dao.model.TranOperationRecord;
import com.example.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranOperationController {

    @Autowired
    private OperationService operationService;

    @GetMapping("/{id}")
    public String getRecord(@PathVariable("id") String id){
        TranOperationRecord record = operationService.getRecord(id);
        if(record != null){
            return JSON.toJSONString(record);
        }
        return "Not Found!";
    }
}
