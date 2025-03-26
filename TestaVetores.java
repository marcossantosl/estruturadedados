public class TestaVetores {
    public static void main(String[] args) {

        ListaVetores lista = new ListaVetores(5);

        lista.insereFinal(10);
        lista.insereFinal(15);
        lista.insereFinal(8);
        lista.insereFinal(12);
        lista.insereFinal(1);
        lista.insereFinal(4);
        lista.imprime();
    
        lista.remove(1);


        lista.imprime();
    }
}
