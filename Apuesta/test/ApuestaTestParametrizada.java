/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Apuesta.Apuesta;
import static java.lang.Math.exp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import Apuesta.Apuesta;
import java.util.ArrayList;

/**
 *
 * @author juanp
 */

@RunWith(value=Parameterized.class)

public class ApuestaTestParametrizada {
    private int goleslocal;
    private int golesvisitante;
    private int dineroapuesta;
    private double ex;
    
    public ApuestaTestParametrizada(int goleslocal,int golesvisitante, int dineroapuesta,double ex) {
        this.goleslocal = goleslocal;
        this.golesvisitante = golesvisitante;
        this.dineroapuesta = dineroapuesta;
        this.ex = ex;   
    }
    
    @Parameterized.Parameters
    public static ArrayList<Object[]> testApuestaParametrizada () {
        ArrayList<Object[]> objeto = new ArrayList();
        objeto.add(new Object[] {2,3,800,4050});
        objeto.add(new Object[] {3,2,1100,300});
        return objeto;
    }
    
    @Test
    public void testapostarParametrizada () {
        try {
            ArrayList<Object[]> objeto = new ArrayList();
            Apuesta apuestaEjemplo = new Apuesta(600,2,3);
            objeto=testApuestaParametrizada();
             
            double resultadoFinal;
            apuestaEjemplo.apostar(dineroapuesta);
            resultadoFinal = apuestaEjemplo.cobrar_apuesta(goleslocal, golesvisitante);
            
            assertEquals(ex,resultadoFinal,0.01);
        } catch (Exception e) {
            fail("Error fatal");
        }
        
    }


  
}
