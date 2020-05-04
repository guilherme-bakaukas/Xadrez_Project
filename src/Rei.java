public class Rei extends Peca{
    char nome;
    Rei(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='K';
        else if (equipe=='B') this.nome='k';
    }
}
