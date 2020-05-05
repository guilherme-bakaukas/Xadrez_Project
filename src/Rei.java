public class Rei extends Peca{
    Rei(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='K';
        else if (equipe=='B') this.nome='k';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos){
        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];

        if (super.verifica_movimento(matriz, vetor_pos)==false) return false;

        int diferenca_linha=linha_final-linha_inicial;
        int diferenca_coluna=coluna_final-coluna_inicial;
        if (diferenca_coluna<0) diferenca_coluna=diferenca_coluna*(-1);
        if (diferenca_linha<0) diferenca_linha=diferenca_linha*(-1);

        if(diferenca_coluna>1 || diferenca_linha>1) return false;

        if (diferenca_coluna!=1 & diferenca_linha!=1) return false;

        return true;

    }

}
