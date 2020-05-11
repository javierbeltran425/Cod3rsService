package com.tracoda.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="archivo")
public class Files implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private BigDecimal id;
    private BigDecimal anio;
    private BigDecimal mes;
    private byte[] contenido;

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

    @Column(name="anio", precision = 11, scale = 0)

    public BigDecimal getAnio() {
        return anio;
    }

    public void setAnio(BigDecimal anio) {
        this.anio = anio;
    }

    @Column(name="mes", precision = 11, scale = 0)

    public BigDecimal getMes() {
        return mes;
    }

    public void setMes(BigDecimal mes) {
        this.mes = mes;
    }

    @Column(name="contenido")

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
