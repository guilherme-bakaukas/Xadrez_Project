public class Bispo extends Peca {

    Bispo(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='B';
        else if (equipe=='B') this.nome='b';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos){
        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];

        if (super.verifica_movimento(matriz,vetor_pos)==false) return false;

        int diferenca_linha=linha_final-linha_inicial;
        int diferenca_coluna=coluna_final-coluna_inicial;

        if ((diferenca_coluna!=diferenca_linha)&(diferenca_coluna!=((-1)*diferenca_linha))) return false;

        int incremento_linha=-1;
        int incremento_coluna=-1;
        if (coluna_inicial<coluna_final) incremento_coluna=1;
        if (linha_inicial<linha_final) incremento_linha=1;
        int linha= linha_inicial;
        int coluna= coluna_inicial;

        while((linha!=linha_final)&(coluna!=coluna_final)){
            linha=linha+incremento_linha;
            coluna=coluna+incremento_coluna;
            if (matriz[linha][coluna]!=null) return false;
        }
        return true;
    }
}
