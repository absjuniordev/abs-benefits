package com.absjrdev.absbenefits.benefitsWallet.dto;

import com.absjrdev.absbenefits.benefits.dto.BenefitsResponseDTO;
import com.absjrdev.absbenefits.employee.dto.EmployeeResponseDTO;

import java.time.LocalDate;

public record BenefitsWalletResponseDTO(EmployeeResponseDTO employee, BenefitsResponseDTO benefits, Double balance, LocalDate lastUpdate) {
}
