package com.absjrdev.absbenefits.employee.dto;

import com.absjrdev.absbenefits.enterprise.dto.EnterpriseResponseDTO;

public record EmployeeResponseDTO(Long id, String name, String cpf, EnterpriseResponseDTO enterprise) {
}
