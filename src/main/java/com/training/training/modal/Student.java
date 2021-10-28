package com.training.training.modal;

/**
 * Created By zepaG on 10/26/2021.
 */
public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName) {
        super();
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
