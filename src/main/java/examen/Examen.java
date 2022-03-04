package examen;

public class Examen {

    public static void main(String[] args) {
        //Creación de matriz desordenada
        int [] matriz = {4,2,1,3,7,6,9,12,45,32,31,29,87,10,5};
        
        //For para imprimir la matriz sin ordenar
        for (int m = 0; m < matriz.length; m++) {
            System.out.print(matriz[m] + " ");
        }
        System.out.println("");
        
        //Llamada al método para ordenar la matriz de menor a mayor.
        OrdernarMatriz.ordenarMatriz(matriz);
        
        //For para imprimir de nuevo la matriz una vez ya ordenada
        for (int n = 0; n < matriz.length; n++) {
            System.out.print(matriz[n] + " ");
        }
    }
}
