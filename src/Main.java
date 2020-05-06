import CSVReader_extension.*;
public class Main {
    public static void main(String[] args){
        Tabuleiro tab=new Tabuleiro();
        tab.print_tabuleiro();
        Objects csv = new Objects();
        csv.setDataSource("./CSVReader_extension/Data.csv");
        Objects commands[] = csv.transforma_Objects();
    }

}
