package com.example.JobsManager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Jobs")
public class Jobs {

    @Id
    private Long id;
    @NotBlank
    private  String title;

    private String description;
    private String location;

    @Min(value = 20000)
    private Double salary;

    @NotNull(message = "company name should not be null")
    private String companyName;
    @NotNull(message = "company email should not be null")
    private String companyEmail;
    @NotNull(message = "employer name should not be null")
    private String employerName;
    @Enumerated(value = EnumType.STRING)
    private Type jobType;
    private LocalDate appliedDate;

}
