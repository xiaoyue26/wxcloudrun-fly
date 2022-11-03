package com.tencent.wxcloudrun.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;

@Service
public class CounterServiceImpl implements CounterService {

    private final CountersMapper countersMapper;

    public CounterServiceImpl(@Autowired CountersMapper countersMapper) {
        this.countersMapper = countersMapper;
    }

    @Override
    public Optional<Counter> getCounter(Integer id) {
        return Optional.ofNullable(countersMapper.getCounter(id));
    }

    @Override
    public void upsertCount(Counter counter) {
        countersMapper.upsertCount(counter);
    }

    @Override
    public void clearCount(Integer id) {
        countersMapper.clearCount(id);
    }
}
