/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempleado;

/**
 *
 * @author juanp
 */
public class EmpleadoPersona {

      public static int validarEmpleadoPersona(String empleado,String departamento,String oficio){
        
        int salario =0;
        
        // Se dará este error (-1) cuando el numero del empleado no empieze por 0
        if(empleado.charAt(0)!= '0'){ 
            return -1;   
        }
        // Se dará este error (-2) cuando el numero de departamente no contenga dos digitos
        if(departamento.length()!=2){ 
            return -2;
        }
        // Se dará este error (-3) al elegir un puesto no permitido
        if(!oficio.equals("Programador") && !oficio.equals("Analista") && !oficio.equals("Diseñador")){
            return -3; 
        }
        // Se dará este error cuando el numero de empleado no tenga 3 digitos
        if(empleado.length() != 3){   
            return -4;  
        }
     
        if("Programador".equals(oficio)){
            salario = 2000;
            return salario;
        }
        if("Analista".equals(oficio)){
            salario = 2500;
            return salario;
        }
        if("Diseñador".equals(oficio)){
            salario = 1500;
            return salario;
        }
        return salario;    
    }
    
}
