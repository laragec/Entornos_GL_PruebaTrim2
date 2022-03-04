/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import examen.OrdernarMatriz;
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
public class Pruebas_Simples_GL_Test {
    
    public Pruebas_Simples_GL_Test() {
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
    public void testOrdenarMatrizPositivos() {
        System.out.println("\nTest matriz con números positivos");
        int[] matrizDesordenada = {6,3,9,8,7,1,4,5,2};
        int[] matrizOrdenada = {1,2,3,4,5,6,7,8,9};
        System.out.println("La matriz a ordenar es esta:");
        for (int m = 0; m < matrizDesordenada.length; m++) {
            System.out.print(matrizDesordenada[m] + " ");
        }
        System.out.println("");
        System.out.println("La matriz esperada es esta:");
        for (int n = 0; n < matrizOrdenada.length; n++) {
            System.out.print(matrizOrdenada[n] + " ");
        }
        System.out.println("");
        OrdernarMatriz.ordenarMatriz(matrizDesordenada);
        System.out.println("El resultado es:");
        for (int i = 0; i < matrizDesordenada.length; i++) {
            System.out.print(matrizDesordenada[i] + " ");
        }
        System.out.println("");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOrdenarMatrizNegativos() {
        System.out.println("\nTest matriz con números negativos");
        int[] matrizDesordenada = {-6,-3,-9,-8,-7,-1,-4,-5,-2};
        int[] matrizOrdenada = {-9,-8,-7,-6,-5,-4,-3,-2,-1};
        System.out.println("La matriz a ordenar es esta:");
        for (int m = 0; m < matrizDesordenada.length; m++) {
            System.out.print(matrizDesordenada[m] + " ");
        }
        System.out.println("");
        System.out.println("La matriz esperada es esta:");
        for (int n = 0; n < matrizOrdenada.length; n++) {
            System.out.print(matrizOrdenada[n] + " ");
        }
        System.out.println("");
        OrdernarMatriz.ordenarMatriz(matrizDesordenada);
        System.out.println("El resultado es:");
        for (int i = 0; i < matrizDesordenada.length; i++) {
            System.out.print(matrizDesordenada[i] + " ");
        }
        System.out.println("");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOrdenarMatrizPositivosNegativos() {
        System.out.println("\nTest matriz con números positivos y negativos");
        int[] matrizDesordenada = {-1,4,3,2,-4,1,-2,-3};
        int[] matrizOrdenada = {-4,-3,-2,-1,1,2,3,4};
        System.out.println("La matriz a ordenar es esta:");
        for (int m = 0; m < matrizDesordenada.length; m++) {
            System.out.print(matrizDesordenada[m] + " ");
        }
        System.out.println("");
        System.out.println("La matriz esperada es esta:");
        for (int n = 0; n < matrizOrdenada.length; n++) {
            System.out.print(matrizOrdenada[n] + " ");
        }
        System.out.println("");
        OrdernarMatriz.ordenarMatriz(matrizDesordenada);
        System.out.println("El resultado es:");
        for (int i = 0; i < matrizDesordenada.length; i++) {
            System.out.print(matrizDesordenada[i] + " ");
        }
        System.out.println("");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
