public class Tabuleiro {
    Peca[][] matriz = new Peca[8][8];
    static char colunas_tabuleiro[] = {0, 1, 2, 3, 4, 5, 6, 7};//utilizados para realizar a transformação de coordenada
    static char colunas[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    static char linhas_tabuleiro[] = {0, 1, 2, 3, 4, 5, 6, 7};
    static char linhas[] = {'8', '7', '6', '5', '4', '3', '2', '1'};

    public int[] transformar_coordenadas(String jogada) {
        int vetor_pos[] = new int[4];
        for (int i = 0; i < 8; i++) {
            if (jogada.charAt(1) == linhas[i]) vetor_pos[0] = linhas_tabuleiro[i];//linha da posição inicial
            if (jogada.charAt(0) == colunas[i]) vetor_pos[1] = colunas_tabuleiro[i];//coluna da posição inicial
            if (jogada.charAt(4) == linhas[i]) vetor_pos[2] = linhas_tabuleiro[i];//linha do posição final
            if (jogada.charAt(3) == colunas[i]) vetor_pos[3] = colunas_tabuleiro[i];//coluna da posição final
        }
        return vetor_pos;
    }

    Tabuleiro() {
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                switch (linha) {
                    case (0):
                        if (coluna == 0 || coluna == 7) matriz[linha][coluna] = new Torre('P');
                        if (coluna == 1 || coluna == 6) matriz[linha][coluna] = new Cavalo('P');
                        if (coluna == 2 || coluna == 5) matriz[linha][coluna] = new Bispo('P');
                        if (coluna == 3) matriz[linha][coluna] = new Rei('P');
                        if (coluna == 4) matriz[linha][coluna] = new Rainha('P');
                        break;
                    case (1):
                        matriz[linha][coluna] = new Peao('P');
                        break;
                    case (6):
                        matriz[linha][coluna] = new Peao('B');
                        break;
                    case (7):
                        if (coluna == 0 || coluna == 7) matriz[linha][coluna] = new Torre('B');
                        if (coluna == 1 || coluna == 6) matriz[linha][coluna] = new Cavalo('B');
                        if (coluna == 2 || coluna == 5) matriz[linha][coluna] = new Bispo('B');
                        if (coluna == 3) matriz[linha][coluna] = new Rei('B');
                        if (coluna == 4) matriz[linha][coluna] = new Rainha('B');
                        break;
                }
            }
        }
    }

    public void print_tabuleiro() {
        for (int linha = 0; linha < 8; linha++) {
            System.out.print((8 - linha) + " ");
            for (int coluna = 0; coluna < 8; coluna++) {
                if (matriz[linha][coluna] == null) System.out.print("- ");
                else System.out.print(matriz[linha][coluna].nome + " ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h ");
    }

    public void substituir(int[] vetor, String peca) {
        int linha_final = vetor[2];
        int coluna_final = vetor[3];
        switch (peca) {
            case ("Bispo"):
                if (linha_final == 7) {
                    matriz[linha_final][coluna_final] = new Bispo('B');
                } else {
                    matriz[linha_final][coluna_final] = new Bispo('P');
                }
                break;
            case ("Rainha"):
                if (linha_final == 7) {
                    matriz[linha_final][coluna_final] = new Rainha('B');
                } else {
                    matriz[linha_final][coluna_final] = new Rainha('P');
                }
                break;
            case ("Torre"):
                if (linha_final == 7) {
                    matriz[linha_final][coluna_final] = new Torre('B');
                } else {
                    matriz[linha_final][coluna_final] = new Torre('P');
                }
                break;
            case ("Cavalo"):
                if (linha_final == 7) {
                    matriz[linha_final][coluna_final] = new Cavalo('B');
                } else {
                    matriz[linha_final][coluna_final] = new Cavalo('P');
                }
                break;
            case ("Peao"):
                if (linha_final == 7) {
                    matriz[linha_final][coluna_final] = new Peao('B');
                } else {
                    matriz[linha_final][coluna_final] = new Peao('P');
                }
                break;

        }
    }

    public void altera_posicao(int[] vetor_pos) {
        int linha_inicial = vetor_pos[0];
        int coluna_inicial = vetor_pos[1];
        int linha_final = vetor_pos[2];
        int coluna_final = vetor_pos[3];

        if (matriz[linha_inicial][coluna_inicial] == null) {
            System.out.println("posição acessada é vazia");
        }
        else {
            matriz[linha_final][coluna_final] = matriz[linha_inicial][coluna_inicial];
            matriz[linha_inicial][coluna_inicial] = null;
        }
    }
}

