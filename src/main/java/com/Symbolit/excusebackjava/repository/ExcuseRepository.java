package com.Symbolit.excusebackjava.repository;

import com.Symbolit.excusebackjava.model.Excuse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExcuseRepository extends JpaRepository<Excuse, Integer> {
}
