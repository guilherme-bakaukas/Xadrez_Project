public class Rainha extends Peca {
    char nome;
    Rainha(char equipe){
        super(equipe);
        if (equipe=='P') this.nome='Q';
        else if (equipe=='B') this.nome='q';
    }
}
