import CSVReader_extension.*;
public class Main {
    public static void main(String[] args){
        Tabuleiro tab=new Tabuleiro();
        tab.print_tabuleiro();
        Objects csv = new Objects();
        csv.setDataSource("src/CSVReader_extension/Data.csv");
        Objects commands[] = csv.transforma_Objects();
        char vez = 'B';

        int tamanho = commands.length;
        for (int i = 0 ; i < tamanho ; i++ ){
            System.out.println("   Source: " + commands[i].movimento.charAt(0)+ commands[i].movimento.charAt(1));
                System.out.println("   Target: " + commands[i].movimento.charAt(3)+ commands[i].movimento.charAt(4));
            int atual[] = tab.transformar_coordenadas(commands[i].movimento);
            System.out.println("   Vez: " + vez);
            if(vez == tab.matriz[atual[0]][atual[1]].equipe & tab.matriz[atual[0]][atual[1]] != null ){
                Peca patual = tab.matriz[atual[0]][atual[1]];
                patual.movimento(atual, tab);
                patual = tab.matriz[atual[2]][atual[3]];
                if(commands[i].peca_transformada != null){
                    tab.substituir(atual, commands[i].peca_transformada );
                }
                if (patual != null) {
                    if (vez == 'B') {
                        vez = 'P';
                    }
                    else{
                        vez = 'B';
                    }
                }
                else{
                    System.out.println("Movimento invalido");
                }

            }
            tab.print_tabuleiro();
            System.out.println();
            System.out.println();

        }
    }

}
