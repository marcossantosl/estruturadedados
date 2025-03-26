public class PilhaVetoresGenerica<Item> {
    private int qt;
    private Item[] vetor;

    public PilhaVetoresGenerica(int tam) {
        this.qt = 0;
        this.vetor = (Item[]) new Object[tam];
    }

    public void empilha(Item valor) {
        if (qt < vetor.length) {
            vetor[qt] = valor;
            qt++;
        }
    }

    public Item desempilha() {
        if (qt != 0) {
            qt--;
            return vetor[qt];
        }
        return null;
    }

    public void imprime() {
        for (int i = 0; i < qt; i++) {
            System.out.print(vetor[i] + "->");
        }
        System.out.println();
    }
}
