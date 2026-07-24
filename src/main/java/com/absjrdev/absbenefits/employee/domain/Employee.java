package com.absjrdev.absbenefits.employee.domain;

import com.absjrdev.absbenefits.enterprise.domain.Enterprise;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="tb_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateBirth;
    private String phone;
    private String email;

    @Column(nullable = false,unique = true)
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;


}
