/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriculacion;

/**
 *
 * @author johan
 */
public class Matricula {
    private double precioMatricula;
    private String referenciaMatricula;
    private short semestreDeMetricula;

    public Matricula() {
    }

    public double getPrecioMatricula() {
        return precioMatricula;
    }

    public void setPrecioMatricula(double precioMatricula) {
        this.precioMatricula = precioMatricula;
    }

    public String getReferenciaMatricula() {
        return referenciaMatricula;
    }

    public void setReferenciaMatricula(String referenciaMatricula) {
        this.referenciaMatricula = referenciaMatricula;
    }

    public short getSemestreDeMetricula() {
        return semestreDeMetricula;
    }

    public void setSemestreDeMetricula(short semestreDeMetricula) {
        this.semestreDeMetricula = semestreDeMetricula;
    }
   
}
