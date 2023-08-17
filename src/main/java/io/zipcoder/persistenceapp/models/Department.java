package io.zipcoder.persistenceapp.models;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long depNum;
    private String name;
    private Employee depManager;
    public Department(){}

    public Department(Long depNum, String name, Employee depManager) {
        this.depNum = depNum;
        this.name = name;
        this.depManager = depManager;
    }

    public Long getDepNum() {
        return depNum;
    }

    public void setDepNum(Long depNum) {
        this.depNum = depNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne 
    public Employee getDepManager() {
        return depManager;
    }

    public void setDepManager(Employee depManager) {
        this.depManager = depManager;
    }
}
