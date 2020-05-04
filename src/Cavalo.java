public class Cavalo extends Peca {

    Cavalo(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='H';
        else if (equipe=='B') this.nome='h';
    }
}
