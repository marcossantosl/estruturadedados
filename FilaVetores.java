public class FilaVetores {
    //if ini +qt >= tam
    private Integer[] vet;
    private int qt, ini;

void FilaVetores(int tam) {
    vet = new Integer[tam];
    qt = ini = 0;
}


void insereFinal(int valor) {
    if (qt < vet.length) {
        int pos = (ini + qt) % vet.length;
        vet[pos] = valor;
        qt++;
    }
}

Integer removeInicio() {
    if(qt !=0) {
        Integer valor = vet[ini];
        qt--;
        ini = (ini +1) %vet.length;
        return valor;
    }
    return null;
}

void imprimeFila(){
    int i = 0;
    int j = ini;
    while(i <qt){
        System.out.print(vet[j] + "->");
        j = (j+1) % vet.length;
    }
    System.out.println();
}
    //ini +qt - tam = pos
}
