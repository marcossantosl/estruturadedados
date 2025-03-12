public class Recursividade {
    public static void main(String[] args) {
        // imprimirDecrescente(10);
        // System.out.println(potencia(10, 3));
        System.out.println(intervalo(2,5));
    }

    public static int intervalo(int inicio, int fim){
        if(inicio <= fim){
            return inicio * intervalo(inicio +1, fim);
        } else return 1;
    }
    // public static int potencia(int base, int exp) {
    //     if (exp == 0)
    //         return 1;
    //     else
    //         return base * potencia(base, exp - 1);
    // }
    /*
     * public static void imprimirDecrescente(int n) {
     * System.out.println(n); // Imprime após o retorno da recursão
     * if (n > 0) {
     * imprimirDecrescente(n - 1); // Chama a recursão primeiro
     *
     * }
     * }
     */
}
