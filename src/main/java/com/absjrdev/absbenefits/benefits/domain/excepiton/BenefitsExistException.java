package com.absjrdev.absbenefits.benefits.domain.excepiton;

public class BenefitsExistException extends BenefitsException {
    public BenefitsExistException(String message) {
        super("Beneficio já criado: " + message);
    }
}
