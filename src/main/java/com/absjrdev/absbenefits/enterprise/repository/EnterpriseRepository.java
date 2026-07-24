package com.absjrdev.absbenefits.enterprise.repository;

import com.absjrdev.absbenefits.enterprise.domain.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
