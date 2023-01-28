package com.Symbolit.excusebackjava.controller;

import com.Symbolit.excusebackjava.model.Excuse;
import com.Symbolit.excusebackjava.service.DataService;
import com.Symbolit.excusebackjava.service.ExcuseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
public class ExcuseController {

    @Autowired
    ExcuseService excuseService;

    @Autowired
    DataService dataService;

    @PostMapping("/saveAll")
    public void saveAll(@RequestBody List<Excuse> excuses){
        dataService.saveAll(excuses);
    }

    @PostMapping("/save")
    public Excuse createExcuse(@RequestBody Excuse excuse){
        return dataService.save(excuse);
    }


    @GetMapping("/allExcuses")
    public List<Excuse> excuseList(){ return excuseService.getAllExcuse();}
}
