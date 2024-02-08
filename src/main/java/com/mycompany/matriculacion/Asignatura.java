/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriculacion;



/**
 *
 * @author johan
 */
public class Asignatura {
    private String nombreAsignatura;
    private int codigoAsignatura;
    private short numeroEstudiantes;
    private short cupoAsignatura;
    Estudiante[] estudiantes = new Estudiante[90];
    
 
    
    public Asignatura(String nombre, int codigo) {
        
        this.cupoAsignatura = 90;
        this.numeroEstudiantes = 0 ;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public short getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(short numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public short getCupoAsignatura() {
        return cupoAsignatura;
    }

    public void setCupoAsignatura(short cupoAsignatura) {
        this.cupoAsignatura = cupoAsignatura;
    }
    
    public void matricular(Estudiante estudiante){
        this.estudiantes[numeroEstudiantes++]=estudiante;
        this.cupoAsignatura--;
        int temp=1;
        /*if(temp>3){
            temp=1;
            this.grupo1.matricular(this.estudiantes[numeroEstudiantes]);
        }else{
            this.grupo1.matricular(this.estudiantes[numeroEstudiantes]);
            temp++;
        }*/
    }
    
    public Object consultar(){
        for (int i=0; i<numeroEstudiantes; i++){
           return estudiantes[i].getNombreEstudiante();
           
                   
        }
        return 0;
    }
}
