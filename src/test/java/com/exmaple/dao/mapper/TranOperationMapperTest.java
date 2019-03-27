package com.exmaple.dao.mapper;

import com.alibaba.fastjson.JSON;
import com.example.Application;
import com.example.dao.mapper.TranOperationRecordMapper;
import com.example.dao.model.TranOperationRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranOperationMapperTest {

    @Autowired
    private TranOperationRecordMapper mapper;

    @Test
    public void testInsert(){
        TranOperationRecord record = new TranOperationRecord();
        record.setRequestId("123456");
        record.setRequestParam("hello world");
        record.setCreateTime(new Date());
        mapper.insert(record);
    }

    @Test
    public void testSelect(){
        TranOperationRecord record = mapper.selectByPrimaryKey("123456");
        System.out.println(JSON.toJSONString(record));
    }
}
