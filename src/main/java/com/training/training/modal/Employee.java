package com.training.training.modal;

import lombok.Data;

import javax.persistence.*;

/**
 * Created By zepaG on 10/26/2021.
 */
@Data//getter setter, constructor and all methods
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(columnDefinition = "varchar(10)", nullable = false)
    private String phoneNumber;
}
