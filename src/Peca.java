public class Peca {
    char equipe;//indica se é preto ('P') ou branco ('B')
    char nome;
    Peca(char equipe){
        if (equipe=='P') this.equipe='P';
        if (equipe=='B') this.equipe='B';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos){
        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];
        if (matriz[linha_final][coluna_final]!=null) return false;
        return true;
    }
}
