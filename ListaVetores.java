public class ListaVetores {
    private int [] dados;
    private int quantidade;


    public ListaVetores(int tamanho) {
        dados = new int[tamanho];
        quantidade = 0;
    }   

    public void insereFinal(int i){
        if(quantidade < dados.length) {
            dados[quantidade] = i;
            quantidade++;
        }
    }

    public Integer removeFinal() {
        if (quantidade > 0) {
            int temp = dados[quantidade - 1];
            quantidade--;
            return temp;
        } else {
            return null;
        }
    }


    public void imprime() {
        for(int i = 0; i < quantidade; i++){
            System.out.print(dados[i]+ "->");
        }
        System.out.println();
    }

}
