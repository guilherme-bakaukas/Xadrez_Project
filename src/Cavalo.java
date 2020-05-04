public class Cavalo extends Peca {
    char nome;//indica o nome apresentado no tabuleiro

    Cavalo(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='H';
        else if (equipe=='B') this.nome='h';
    }
}
