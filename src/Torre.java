public class Torre extends Peca {
    Torre(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='T';
        else if (equipe=='B') this.nome='t';
    }
}
