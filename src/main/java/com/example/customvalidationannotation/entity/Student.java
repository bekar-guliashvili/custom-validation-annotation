package com.example.customvalidationannotation.entity;


import com.example.customvalidationannotation.validation.ValidatePhoneNumber;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email must be a valid email address")
    private String email;

    //Custom Validation annotation
    @ValidatePhoneNumber
    private String mobile;




}
