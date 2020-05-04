public class Torre extends Peca {
    Torre(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='T';
        else if (equipe=='B') this.nome='t';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos){
        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];

        if(super.verifica_movimento(matriz,vetor_pos)==false) return false;

        if (linha_final!=linha_inicial & coluna_final!=coluna_inicial) return false;

        if (linha_final==linha_inicial){
            int incremento=0;
            if (coluna_final>=coluna_inicial) incremento=1;
            if (coluna_final<coluna_inicial) incremento=-1;
            int coluna=coluna_inicial;
            while(coluna<=coluna_final){
                if (matriz[linha_final][coluna]!=null) return false;
                else coluna+=incremento;
            }
        }
        if (coluna_final==coluna_inicial){
            int incremento=0;
            if (linha_final>=linha_inicial) incremento=1;
            if (linha_final<linha_inicial) incremento=-1;
            int linha=linha_inicial;
            while (linha<=linha_final){
                if (matriz[linha][coluna_final]!=null) return false;
                else linha+=incremento;
            }
        }

        return true;
    }
}
