package examen;

public class OrdernarMatriz {

    public static void ordenarMatriz(int[] matrizDesordenada) {
        //Declaración de variables:
        int i;
        int j;
        int k;
        //Bucle for para recorrer toda la matriz hasta la penúltima posición.
        for (i = 0; i < matrizDesordenada.length - 1; i++) {
            //Bucle for que recorre toda la matriz hasta la penútlima posición.
            for (j = 0; j < matrizDesordenada.length - 1; j++) {
                //If con la condición que si el número que está la posición siguiente es menor al de la poscición actual, estos dos se intercambien.
                //El primer bucle hace que los números de la matriz estén realmentre en orden de menor a mayor.
                if (matrizDesordenada[j + 1] < matrizDesordenada[j]) {
                    k = matrizDesordenada[j + 1];
                    matrizDesordenada[j + 1] = matrizDesordenada[j];
                    matrizDesordenada[j] = k;
                }
            }
        }
    }
    
}
