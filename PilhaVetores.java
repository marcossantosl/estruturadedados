public class PilhaVetores {
    private int qt;
    private Integer[] vetor;
   
    public PilhaVetores(int tam) {
        this.qt = 0;
      vetor = new Integer[tam];
    }

    public void empilha(int valor){
        if(qt <vetor.length){
            vetor[qt] = valor;
            qt++;
        }
    }
    public Integer desempilha(){
        if(qt!=0){
            qt--;
            return vetor[qt];
        }
        return null;
    }

    public void imprime(){
        for(int i =0;i<qt;i++){
            System.out.print(vetor[i]+"->");
        }
        System.out.println();
    }
}
