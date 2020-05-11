package com.tracoda.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="archivo")
public class Files implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private BigDecimal id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique=true,nullable = false,precision = 11,scale = 0)
    public BigDecimal getId(){
        return id;
    }

    public void setId(BigDecimal id){
        this.id = id;
    }

    @Column(name="nombre", length=50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
