package com.tracoda.interfaces;

import com.tracoda.model.Files;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.Optional;

public interface FileRepository extends CrudRepository<Files, BigDecimal> {
    public Optional<Files> findById(BigDecimal id);
    public Iterable<Files> findByMes(BigDecimal mes);
    public Iterable<Files> findByAnioAndMes(BigDecimal anio, BigDecimal mes);
}
