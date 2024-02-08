/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriculacion;

/**
 *
 * @author johan
 */
public class GrupoAsignatura {
    private int codigoGrupo;
    private short cupoGrupo;
    private short numeroEstudiantes;
    private short numeroGrupo;
    private String asignatura;
    Estudiante[] estudiantes = new Estudiante[30];
    public GrupoAsignatura(int codigoGrupo, int cupoGrupo, int numeroGrupo, String asignatura) {
        this.codigoGrupo = codigoGrupo;
        this.cupoGrupo = (short) cupoGrupo;
        this.numeroGrupo = (short) numeroGrupo;
        this.asignatura = asignatura;
        
    }

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public short getCupoGrupo() {
        return cupoGrupo;
    }

    public void setCupoGrupo(short cupoGrupo) {
        this.cupoGrupo = cupoGrupo;
    }

    public short getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(short numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
      public void matricular(Estudiante estudiante){
        this.estudiantes[numeroEstudiantes++]=estudiante;
        this.cupoGrupo--;
        
    }
          public Object consultar(){
        for (int i=0; i<cupoGrupo; i++){
           return estudiantes[i].getNombreEstudiante();
           
                   
        }
        return 0;
    }
}
