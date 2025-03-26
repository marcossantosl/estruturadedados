public class TestaPilhaVetores {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[]args) {
        // PilhaVetores pilha = new PilhaVetores(10);
        PilhaVetoresGenerica pilha = new PilhaVetoresGenerica(10);
        

        pilha.empilha("maria");
        pilha.empilha("carlos");
        pilha.empilha(30);

        

        pilha.imprime();
    }
}
