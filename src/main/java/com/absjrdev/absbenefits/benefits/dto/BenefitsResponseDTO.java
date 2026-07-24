package com.absjrdev.absbenefits.benefits.dto;

import com.absjrdev.absbenefits.benefits.domain.Benefits;

public record BenefitsResponseDTO(
        Long id,
        String name,
        String description,
        Double limitMonthly
) {
    public static BenefitsResponseDTO from(Benefits benefits) {
        return new BenefitsResponseDTO(
                benefits.getId(),
                benefits.getNome(),
                benefits.getDescription(),
                benefits.getLimitMonthly());
    }
}
