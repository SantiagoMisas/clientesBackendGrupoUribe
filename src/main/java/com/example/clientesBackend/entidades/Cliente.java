package com.example.clientesBackend.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="tipoDeIdentificacion")
    private String tipoDeIdentificacion;
    @Column(name="numeroDeIdentificacion")
    private String numeroDeIdentificacion;
    @Column(name="primerNombre")
    private String primerNombre;
    @Column(name="segundoNombre")
    private String segundoNombre;
    @Column(name="primerApellido")
    private String primerApellido;
    @Column(name="segundoApellido")
    private String segundoApellido;
    @Column(name="fechaDeNacimiento")
    private Date fechaDeNacimiento;
    @Column(name="direccion")
    private String direccion;

    @Column(name="nombreDeCiudad")
    private String nombreDeCiudad;

    @Column(name="nombreDeDepartamento")
    private String nombreDeDepartamento;

    @Column(name="nombreDePais")
    private String nombreDePais;

    @Column(name="nombreDeMarca")
    private String nombreDeMarca;
}
