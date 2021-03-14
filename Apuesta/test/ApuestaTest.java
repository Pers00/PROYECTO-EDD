

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Apuesta.Apuesta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanp
 */
public class ApuestaTest {
    
    public ApuestaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Apuesta apuesta1 = new Apuesta(500,1,0);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    
    @Test
    public void testapostar1(){
        Apuesta apuesta1 = new Apuesta(500, 1 ,0);
        try{
            apuesta1.apostar(-20);
            System.out.println("T1:Se ha procesado tu apuesta correctamente"); 
        }catch(Exception e){
            System.out.println("T1:No puedes apostar dinero que sea negativo ");
        };
    }
    @Test
    public void testapostar2(){
        Apuesta apuesta1 = new Apuesta(500, 1 ,0);
        try{
            apuesta1.apostar(0);
            System.out.println("T2:Se ha procesado tu apuesta correctamente"); 
        }catch(Exception e){
            System.out.println("T2:Tienes que apostar un mínimo de dinero");
        };
    }
    @Test
    public void testapostar3(){
        Apuesta apuesta1 = new Apuesta(500, 1 ,0);
        try{
            apuesta1.apostar(20);
            System.out.println("T3:Se ha procesado tu apuesta correctamente"); 
        }catch(Exception e){
            System.out.println("T3:No puedes apostar dinero negativo o nada");
        };
    }
    
    @Test
    public void testapostar4(){
        Apuesta apuesta1 = new Apuesta(500, 1 ,0);
        try{
            apuesta1.apostar(690);
            System.out.println("T4:Se ha procesado tu apuesta correctamente"); 
        }catch(Exception e){
            System.out.println("T4:No tienes dinero con el que apostar");
        };
    }
    @Test
    public void testapostar5(){
        Apuesta apuesta1 = new Apuesta(500, 1 ,0);
        try{
            apuesta1.apostar(200);
            System.out.println("T5:Se ha procesado tu apuesta correctamente"); 
        }catch(Exception e){
            System.out.println("T5:No puedes apostar dinero negativo o nada");
        };
    }

    
    @Test
    public void testcobrar_apuesta1(){
        Apuesta apuesta1 = new Apuesta(500, 1 ,2);
        try{
            apuesta1.cobrar_apuesta(1, 2);
            System.out.println("T1_C:Has cobrado correctamente"); 
        }catch(Exception e){
            System.out.println("T1_C:No lo has cobrado (no están permitidos goles negativos)");
        };
    }
    
     @Test
    public void testcobrar_apuesta2(){
        Apuesta apuesta1 = new Apuesta(500, -1 ,2);
        try{
            apuesta1.cobrar_apuesta(-1,2);
            System.out.println("T2_C:Has cobrado correctamente"); 
        }catch(Exception e){
            System.out.println("T2_C:No lo has cobrado (no están permitidos goles negativos)");
        };
    }
    
     @Test
    public void testcobrar_apuesta3(){
        Apuesta apuesta1 = new Apuesta(500, -1 ,-2);
        try{
            apuesta1.cobrar_apuesta(-1, -2);
            System.out.println("T3_C:Has cobrado correctamente"); 
        }catch(Exception e){
            System.out.println("T3_C:No lo has cobrado (no están permitidos goles negativos)");
        };
    }
    
    // hemos puesto cobrar_apuesta como public
    
    @Test
    public void testcobrar_apuesta4(){
        Apuesta apuesta1 = new Apuesta(500, 0 ,0);
        try{
            apuesta1.cobrar_apuesta(0, 0);
            System.out.println("T4_C:Has cobrado correctamente"); 
        }catch(Exception e){
            System.out.println("T4_C:No lo has cobrado (no están permitidos goles negativos)");
        };
    }   
    @Test
    public void testcobrar_apuesta5(){
        Apuesta apuesta1 = new Apuesta(500, 5 ,0);
        try{
            apuesta1.cobrar_apuesta(5, 0);
            System.out.println("T5_C:Has cobrado correctamente"); 
        }catch(Exception e){
            System.out.println("T5_C:No lo has cobrado (no están permitidos goles negativos)");
        };
    }
    
  
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
