public class Rainha extends Peca {
    Rainha(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='Q';
        else if (equipe=='B') this.nome='q';
    }

    public boolean verifica_movimento(Peca[][] matriz, int[] vetor_pos) {
        int linha_inicial=vetor_pos[0];
        int coluna_inicial=vetor_pos[1];
        int linha_final=vetor_pos[2];
        int coluna_final=vetor_pos[3];
        int diferenca_linha=linha_final-linha_inicial;
        int diferenca_coluna=coluna_final-coluna_inicial;

        if (super.verifica_movimento(matriz,vetor_pos)==false) return false;

        //analise dos movimentos horizontais e verticais

        if (linha_final==linha_inicial){
            int incremento=0;
            if (coluna_final>coluna_inicial) incremento=1;
            if (coluna_final<coluna_inicial) incremento=-1;
            int coluna=coluna_inicial+incremento;
            while(coluna<coluna_final){
                if (matriz[linha_final][coluna]!=null) return false;
                else coluna+=incremento;
            }
        }
        else if (coluna_final==coluna_inicial){
            int incremento=0;
            if (linha_final>linha_inicial) incremento=1;
            if (linha_final<linha_inicial) incremento=-1;
            int linha=linha_inicial+incremento;
            while (linha<linha_final){
                if (matriz[linha][coluna_final]!=null) return false;
                else linha+=incremento;
            }
        }

        //analise dos movimentos diagonais

        else if (diferenca_coluna==diferenca_linha||diferenca_coluna==diferenca_linha*(-1)) {
            int incremento_linha = -1;
            int incremento_coluna = -1;
            if (coluna_inicial < coluna_final) incremento_coluna = 1;
            if (linha_inicial < linha_final) incremento_linha = 1;
            int linha = linha_inicial;
            int coluna = coluna_inicial;

            while ((linha != linha_final) & (coluna != coluna_final)) {
                linha = linha + incremento_linha;
                coluna = coluna + incremento_coluna;
                if (matriz[linha][coluna] != null) return false;
            }
        }
        else return false;//se não for diagonal nem horizontal, nem vertical deve retornar falso

        return true;//caso não tenha retornado falso nas condições anteriores o movimento é válido

    }
}
