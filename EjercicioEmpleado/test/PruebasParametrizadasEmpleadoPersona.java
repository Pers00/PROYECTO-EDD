/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicioempleado.EmpleadoPersona;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author juanp
 */

@RunWith(value=Parameterized.class)
public class PruebasParametrizadasEmpleadoPersona {
    
    private String oficio;
    private String empleado;
    private String departamento;
    private double salario;
    private double ex;
    
    public PruebasParametrizadasEmpleadoPersona(String empleado, String departamento,String oficio,double salario, double ex) {
        this.oficio = oficio;
        this.empleado=empleado;
        this.departamento=departamento;
        this.salario=salario;
        this.ex=ex; 
    }
    @Parameterized.Parameters
    public static ArrayList<Object[]> testsalarioEmpleadoParametrizadas () {
        ArrayList<Object[]> objeto = new ArrayList();
        
        // Valores validos
        objeto.add(new Object[] {"084","19","Diseñador",1500,1500});
        objeto.add(new Object[] {"022","12","Programador",2000,2000});
        objeto.add(new Object[] {"071","22","Analista",2500,2500});
        objeto.add(new Object[] {"042","18","Programador",2000,2000});
        objeto.add(new Object[] {"024","33","Diseñador",1500,1500});
        
        // Valores no validos
        
        // Error por que no empieza por 0 el numero de empleado
        objeto.add(new Object[] {"782","21","Programador",-1,-1}); 
       
        // Error el departamento no tiene 2 digitos
        objeto.add(new Object[] {"055","611","Analista",-2,-2});
        
        // Error por elegir un puesto no permitido
        objeto.add(new Object[] {"023","21","Profesor",-3,-3});
        
        // Error el nuemero de empleado no tiene 3 digitos
        objeto.add(new Object[] {"04","21","Programador",-4,-4}); 
     
        return objeto;
    }
    @Test
    public void testcalculaSalarioEmpleado() {
        try {
            ArrayList<Object[]> objeto = new ArrayList();
            objeto=testsalarioEmpleadoParametrizadas();
            
            int resultadoFinal = EmpleadoPersona.validarEmpleadoPersona(empleado,departamento,oficio);
            assertEquals(ex, resultadoFinal, 0.1);
            
        } catch (Exception e) {
            fail("Error fatal");
        }
    }

}
