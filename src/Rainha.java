public class Rainha extends Peca {
    Rainha(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='Q';
        else if (equipe=='B') this.nome='q';
    }
}
