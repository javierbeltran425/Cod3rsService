package com.tracoda.interfaces;

import com.tracoda.model.Files;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface FileRepository extends CrudRepository<Files, BigDecimal> {
}
