package com.tracoda.interfaces;

import com.tracoda.model.Files;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface FileRepository extends CrudRepository<Files, BigDecimal> {
    public Iterable<Files> findByMes(BigDecimal mes);
    public Iterable<Files >findByMesAndAnio(BigDecimal mes, BigDecimal anio);
}
