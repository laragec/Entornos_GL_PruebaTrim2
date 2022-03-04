/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import examen.OrdernarMatriz;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNO TARDE
 */
public class Pruebas_Avanzadas_GL_Test {
    
    public Pruebas_Avanzadas_GL_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ordenarMatriz method, of class OrdernarMatriz.
     */
    @Test 
    public void testOrdenarMatrizTimeOut() {
        int [] matrizDesordenada = new int [5000];
        Random rndNum=new Random();
        for (int i = 0; i < matrizDesordenada.length; i++) {
            matrizDesordenada[i] = rndNum.nextInt(5000)+1;
        }
        System.out.println("\nLa matriz a ordenar es esta:");
        for (int m = 0; m < matrizDesordenada.length; m++) {
            System.out.print(matrizDesordenada[m] + " ");
        }
        System.out.println("");
        OrdernarMatriz.ordenarMatriz(matrizDesordenada);
        System.out.println("El resultado es:");
        for (int i = 0; i < matrizDesordenada.length; i++) {
            System.out.print(matrizDesordenada[i] + " ");
        }
        System.out.println("");
    }
    
}
