public class Peao extends Peca {

    Peao(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='P';
        else if (equipe=='B') this.nome='p';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos){

        // talvez tenha que colocar o caso da primeira rodada, em que o peao pode andar duas casas

        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];

        if (super.verifica_movimento(matriz,vetor_pos)==false) return false;

        if (coluna_final!=coluna_inicial) return false;
        switch (this.equipe){
            case('P'):
                if (linha_final-linha_inicial!=1) return false;
            case('B'):
                if (linha_final-linha_inicial!=-1) return false;
        }

        return true;
    }
}
