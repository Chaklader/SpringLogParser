package com.ef.service;

import com.ef.entity.LogEntity;
import com.ef.repository.LogEntryRepository;
import com.ef.service.def.LogEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chaklader on Oct, 2017
 */
@Service
@Transactional
public class LogEntityServiceImpl implements LogEntityService {

    @Autowired
    private LogEntryRepository logEntryRepository;

    @Override
    public List<LogEntity> findAll() {
        return (List<LogEntity>) logEntryRepository.findAll();
    }

    @Override
    public void save(LogEntity logEntity) {
        logEntryRepository.save(logEntity);
    }

    @Override
    public void saveAllLogEntities(List<LogEntity> logEntities) {
        logEntryRepository.save(logEntities);
    }
}
