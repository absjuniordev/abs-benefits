package com.absjrdev.absbenefits.logOperation.repository;

import com.absjrdev.absbenefits.logOperation.domain.LogOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogOperationRepository extends JpaRepository<LogOperation, Long> {
}
