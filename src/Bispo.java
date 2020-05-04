public class Bispo extends Peca {

    Bispo(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='B';
        else if (equipe=='B') this.nome='b';
    }
}
