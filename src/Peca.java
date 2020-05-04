public class Peca {
    char equipe;//indica se é preto ('P') ou branco ('B')
    char nome;
    Peca(char equipe){
        if (equipe=='P') this.equipe='P';
        if (equipe=='B') this.equipe='B';
    }
}
