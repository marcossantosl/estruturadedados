public class ListaVetores {
    private Integer[] dados;
    private int quantidade;

    public ListaVetores(int tamanho) {
        dados = new Integer[tamanho];
        quantidade = 0;
    }

    // public void insereFinal(int i) {
    // if (quantidade < dados.length) {
    // dados[quantidade] = i;
    // quantidade++;
    // }
    // }

    // public Integer removeFinal() {
    // if (quantidade > 0) {
    // int temp = dados[quantidade - 1];
    // quantidade--;
    // return temp;
    // } else {
    // return null;
    // }
    // }

    public Integer removeFinal() {
        if (quantidade > 0) {
            int temp = dados[quantidade - 1];
            quantidade--;

            if (quantidade > 0 && quantidade < dados.length / 4)
                resize(dados.length / 2);
                
                return temp;
            }
            Integer temp = null;
            return temp;
        }
        
    public void InsereFinal(int i) {

        if (quantidade == dados.length)
            resize(2 * dados.length);

        dados[quantidade] = i;
        quantidade++;

    }

    public Integer remove(int pos) {

        if (pos < quantidade) {
            Integer temp = dados[pos];
            for (int i = pos; i < quantidade - 1; i++) {
                dados[i] = dados[i + 1];
            }
            return temp;
        }
       return null;
    }

    // int retiraPos(int pos) {
    // int item = dados[pos];

    // for (int i = pos + 1; i < quantidade; i++) {
    // dados[i - 1] = dados[i];
    // }
    // return item;
    // }

    public void resize(int max) {
        Integer[] temp = new Integer[max];

        for (int i = 0; i < this.quantidade; i++)
            temp[i] = this.dados[i];

        dados = temp;
    }

    public void imprime() {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(dados[i] + "->");
        }
        System.out.println("tamanho vetor = "+dados.length);
    }


    public void concatena(ListaVetores listaB){
        Integer[] temp = new Integer[dados.length + listaB.dados.length];

        for(int i = 0; i < quantidade; i++){
            temp[i] = dados[i];
        }
        int j = quantidade;
        for (int i = quantidade; i <listaB.quantidade;i++){
            temp[i] = listaB.dados[j];
            j++;
        }

        dados = new Integer[vetor.length + listaB.vetor.length];
        vetor = temp;
        quantidade
    }
}
