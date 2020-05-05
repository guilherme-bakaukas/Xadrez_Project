public class Peao extends Peca {

    Peao(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='P';
        else if (equipe=='B') this.nome='p';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos){

        // talvez tenha que colocar o caso da primeira rodada, em que o peao pode andar duas casas
        //caso formos colocar essa condição, temos que analisar se é ou não seu primeiro movimento

        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];
        int diferenca_coluna=coluna_final-coluna_inicial;

        if (super.verifica_movimento(matriz,vetor_pos)==false) return false;

        switch (this.equipe){
            case('P'):
                if (linha_final-linha_inicial!=1) return false;
            case('B'):
                if (linha_final-linha_inicial!=-1) return false;
        }

        if (coluna_final==coluna_inicial){
            if (matriz[linha_final][coluna_final]!=null) return false;
        }
        else{
            if(diferenca_coluna!=1&diferenca_coluna!=-1) return false;
            else if (matriz[linha_final][coluna_final]==null) return false;
        }

        return true;
    }

}

//caso do peao, ele deve capturar caso de false na movimentação e true na captura