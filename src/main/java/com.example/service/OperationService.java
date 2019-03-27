package com.example.service;

import com.example.dao.mapper.TranOperationRecordMapper;
import com.example.dao.model.TranOperationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

    @Autowired
    private TranOperationRecordMapper mapper;

    public TranOperationRecord getRecord(String requestId){
        TranOperationRecord record = mapper.selectByPrimaryKey(requestId);
        return record;
    }
}
