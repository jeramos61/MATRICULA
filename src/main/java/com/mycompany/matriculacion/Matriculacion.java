/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriculacion;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Matriculacion {

    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura("Redes y Servicios",457183);
        Asignatura asignatura2 = new Asignatura("Construccion de software",454873);
        Asignatura asignatura3 = new Asignatura("Modelado y Simualcion",457183);
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro PAW que activida desear realizar"
                + "\n (1)Matricular asigantura"
                + "\n (2)Consultar estudiantes de asiganturas"
                + "\n (3)Consultar estudiantes  de Grupo");
        
        int opcion1 = tc.nextInt();
        tc.nextLine();
        
        switch (opcion1){
            case 1:
                Estudiante estudiante = new Estudiante ();
                System.out.println("Diligencia los siguientes datos; \n");
                System.out.println("Diligencia tu nombre completo; \n");
                estudiante.setNombreEstudiante(tc.nextLine());
                System.out.println("Diligencia tu edad; \n");
                estudiante.setEdad(tc.nextShort());
                System.out.println("Diligencia tu correo personal; \n");
                estudiante.setCorreoPersonal(tc.nextLine());
                System.out.println("Selecciona tu genero; \n"
                        + "(1) Femenino \n"
                        + "(2) Masculino \n"
                        + "(3) No Binarie\n");
                int opcion2=tc.nextInt();
                switch (opcion2){
                    case 1:
                        estudiante.setGenero("Femenino");
                        break;
                    case 2:
                        estudiante.setGenero("Masculino");
                        break;
                    case 3:
                        estudiante.setGenero("No Binarie");
                        break;
                    default:
                        estudiante.setGenero("No Binarie");
                        break;
                        
                }
                
                System.out.println("Diligencia diligencia tu celular; \n");
                estudiante.setCelular(tc.nextDouble());
                tc.nextLine();
                
                System.out.println("Seleccione Asignatura: \n"
                        + "(1) Redes y Servicios"
                        + "(2) Construccion de Software"
                        + "(3) Modelado y Simualcion"); 
                int opcion3=tc.nextInt();
                switch (opcion3){
                    case 1:
                        asignatura1.matricular(estudiante);
                        break;
                    case 2:
                        asignatura2.matricular(estudiante);
                        break;
                    case 3:
                        asignatura3.matricular(estudiante);
                        break;
                }
                
                break;
            case 2:
                break;
            case 3:
                break;
             
        }
    }
    }

