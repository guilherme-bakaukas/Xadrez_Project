public class Bispo extends Peca {
    char nome;//indica o nome apresentado no tabuleiro

    Bispo(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='B';
        else if (equipe=='B') this.nome='b';
    }
}
