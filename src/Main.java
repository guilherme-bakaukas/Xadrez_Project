import CSVReader_extension.*;
public class Main {
    public static void main(String[] args){
        Tabuleiro tab=new Tabuleiro();
        tab.print_tabuleiro();
        Objects csv = new Objects();
        csv.setDataSource("C:/Users/guilh/IdeaProjects/Xadrez_Project/src/CSVReader_extension/Data.csv");
        Objects commands[] = csv.transforma_Objects();
    }

}
