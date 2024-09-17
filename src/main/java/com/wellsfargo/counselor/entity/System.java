package com.wellsfargo.counselor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "operating_hours", nullable = false)
    private String operatingHours;

    @Column(name = "uptime", nullable = false)
    private double uptime;

    @Column(name = "react_dashboard", nullable = false)
    private boolean reactDashboard;

    @Column(name = "spring_framework_for_java", nullable = false)
    private boolean springFrameworkForJava;

    @Column(name = "data_storage", nullable = false)
    private String dataStorage;

    // Constructor
    public System(String operatingHours, double uptime, boolean reactDashboard, boolean springFrameworkForJava, String dataStorage) {
        this.operatingHours = operatingHours;
        this.uptime = uptime;
        this.reactDashboard = reactDashboard;
        this.springFrameworkForJava = springFrameworkForJava;
        this.dataStorage = dataStorage;
    }

    public System() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    public boolean isReactDashboard() {
        return reactDashboard;
    }

    public void setReactDashboard(boolean reactDashboard) {
        this.reactDashboard = reactDashboard;
    }

    public boolean isSpringFrameworkForJava() {
        return springFrameworkForJava;
    }

    public void setSpringFrameworkForJava(boolean springFrameworkForJava) {
        this.springFrameworkForJava = springFrameworkForJava;
    }

    public String getDataStorage() {
        return dataStorage;
    }

    public void setDataStorage(String dataStorage) {
        this.dataStorage = dataStorage;
    }
}