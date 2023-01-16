package com.example.clientesBackend.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
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
    private String fechaDeNacimiento;
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

    public Cliente() {
    }

    public Cliente(Integer id, String tipoDeIdentificacion, String numeroDeIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String fechaDeNacimiento, String direccion, String nombreDeCiudad, String nombreDeDepartamento, String nombreDePais, String nombreDeMarca) {
        this.id = id;
        this.tipoDeIdentificacion = tipoDeIdentificacion;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.nombreDeCiudad = nombreDeCiudad;
        this.nombreDeDepartamento = nombreDeDepartamento;
        this.nombreDePais = nombreDePais;
        this.nombreDeMarca = nombreDeMarca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDeIdentificacion() {
        return tipoDeIdentificacion;
    }

    public void setTipoDeIdentificacion(String tipoDeIdentificacion) {
        this.tipoDeIdentificacion = tipoDeIdentificacion;
    }

    public String getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDeCiudad() {
        return nombreDeCiudad;
    }

    public void setNombreDeCiudad(String nombreDeCiudad) {
        this.nombreDeCiudad = nombreDeCiudad;
    }

    public String getNombreDeDepartamento() {
        return nombreDeDepartamento;
    }

    public void setNombreDeDepartamento(String nombreDeDepartamento) {
        this.nombreDeDepartamento = nombreDeDepartamento;
    }

    public String getNombreDePais() {
        return nombreDePais;
    }

    public void setNombreDePais(String nombreDePais) {
        this.nombreDePais = nombreDePais;
    }

    public String getNombreDeMarca() {
        return nombreDeMarca;
    }

    public void setNombreDeMarca(String nombreDeMarca) {
        this.nombreDeMarca = nombreDeMarca;
    }
}
