package io.zipcoder.persistenceapp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeNum;
    private String firstName;
    private String lastName;
    private String title;
    private String phoneNum;
    private String email;
    private Date hiredate;
    private String manager;

    private Department depNum;


    public Employee(){}
    public Employee(Long employeeNum, String firstName, String lastName, String title, String phoneNum,
                                        String email, Date hiredate, String manager, Department depNum) {
        this.employeeNum = employeeNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNum = phoneNum;
        this.email = email;
        this.hiredate = hiredate;
        this.manager = manager;
        this.depNum = depNum;
    }

    public Long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Long employeeNum) {
        this.employeeNum = employeeNum;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @OneToOne
    public Department getDepNum() {
        return depNum;
    }

    public void setDepNum(Department depNum) {
        this.depNum = depNum;
    }
}
