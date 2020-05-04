public class Peao extends Peca {

    Peao(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='P';
        else if (equipe=='B') this.nome='p';
    }
}
