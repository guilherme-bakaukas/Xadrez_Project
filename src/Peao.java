public class Peao extends Peca {
    char nome;//indica o nome apresentado no tabuleiro

    Peao(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='P';
        else if (equipe=='B') this.nome='p';
    }
}
