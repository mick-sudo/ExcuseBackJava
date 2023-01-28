package com.Symbolit.excusebackjava.service;


import com.Symbolit.excusebackjava.model.Excuse;
import com.Symbolit.excusebackjava.repository.ExcuseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    ExcuseRepository excuseRepository;

    public void saveAll(List<Excuse> excuses){
        this.excuseRepository.saveAll(excuses);
    }

    @Override
    public Excuse save(Excuse excuse) {
       return this.excuseRepository.save(excuse);
    }
}
