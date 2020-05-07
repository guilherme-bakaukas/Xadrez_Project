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
        if (matriz[linha_final][coluna_final]!=null){
            if (matriz[linha_final][coluna_final].equipe==this.equipe) return false;
            //já retorna falso caso haja uma peça da mesma equipe na posição final
        }
        if (linha_final==linha_inicial && coluna_final==coluna_inicial){
            return false;
        }
        else{

            return true;

        }
    }

    public boolean verifica_captura(Peca[][] matriz, int[]vetor_pos){

        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];

        if (matriz[linha_final][coluna_final]==null) return false;//se não houver, não é captura

        return true;//caso haja uma peça ali, saberemos que é da equipe adversária, ois se não teria dado false no verifica_movimento
    }

    public void movimento(int[] vetor_pos, Tabuleiro tab){
        if (verifica_movimento(tab.matriz, vetor_pos)){
            if(verifica_captura(tab.matriz, vetor_pos)){
                tab.altera_posicao(vetor_pos);
            }
            else{
                tab.altera_posicao(vetor_pos);
            }
        }

        //verificar inicialmente a movimentação, se der true, verificar a captura, se der true é captura
        // se der false é apenas a movimentaçao
        //se a movimentação der false, nada deve ser feito
    }
}
