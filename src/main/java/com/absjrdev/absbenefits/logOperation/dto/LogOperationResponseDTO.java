package com.absjrdev.absbenefits.logOperation.dto;

import com.absjrdev.absbenefits.logOperation.domain.LogOperation;
import com.absjrdev.absbenefits.user.dto.UserResponseDTO;

import java.time.LocalDateTime;

public record LogOperationResponseDTO(
        Long id,
        String action,
        LocalDateTime dateTime,
        String details,
        UserResponseDTO user
) {

    public static LogOperationResponseDTO from(LogOperation log) {
        return new LogOperationResponseDTO(
                log.getId(),
                log.getAction(),
                log.getDateTime(),
                log.getDetails(),
                UserResponseDTO.from(log.getUser())
        );
    }
}