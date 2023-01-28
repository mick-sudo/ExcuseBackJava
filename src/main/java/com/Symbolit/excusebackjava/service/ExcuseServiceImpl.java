package com.Symbolit.excusebackjava.service;

import com.Symbolit.excusebackjava.model.Excuse;
import com.Symbolit.excusebackjava.repository.ExcuseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExcuseServiceImpl implements ExcuseService{

    @Autowired
    ExcuseRepository excuseRepository;
    @Override
    public List<Excuse> getAllExcuse() {
        return excuseRepository.findAll();
    }
}
