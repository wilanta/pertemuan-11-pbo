package com.aritmatika.operation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double a;
    private String op;
    private double b;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public String getOp() { return op; }
    public void setOp(String op) { this.op = op; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }
}
