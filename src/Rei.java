public class Rei extends Peca{
    Rei(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='K';
        else if (equipe=='B') this.nome='k';
    }
}
