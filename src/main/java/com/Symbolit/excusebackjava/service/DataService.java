package com.Symbolit.excusebackjava.service;

import com.Symbolit.excusebackjava.model.Excuse;

import java.util.List;
import java.util.Set;

public interface DataService {

    void saveAll(List<Excuse> excuses);

    Excuse save(Excuse excuse);
}
