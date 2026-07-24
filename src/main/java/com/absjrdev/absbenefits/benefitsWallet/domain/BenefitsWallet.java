package com.absjrdev.absbenefits.benefitsWallet.domain;

import com.absjrdev.absbenefits.employee.domain.Employee;
import com.absjrdev.absbenefits.benefits.domain.Benefits;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_benefits_wallet")
public class BenefitsWallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "benefits_id")
    private Benefits benefits;

    private Double balance;

    private LocalDate lastUpdate;
}
