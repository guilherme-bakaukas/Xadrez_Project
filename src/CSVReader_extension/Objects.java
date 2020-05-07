package CSVReader_extension;

public class Objects extends CSVReader{
    public String movimento;
    public String peca_transformada;
    public Objects(){
        super ();
    }
    public Objects[] transforma_Objects(){
        String[] commands=requestCommands();
        int tamanho=commands.length;
        int new_size=tamanho;
        for (int a=0;a<tamanho;a++){
            if (commands[a].length()<2)new_size--;
        }
        Objects[] vetor=new Objects[new_size];
        int current_pos=0;
        for (int i=0;i<tamanho;i++){
            if (commands[i].length()<2){
                current_pos=current_pos-1;
                vetor[current_pos]=null;
                vetor[current_pos]=new Transforma(commands[i],commands[i-1]);
            }
            else vetor[current_pos]=new Movimento(commands[i]);
            current_pos++;
        }
        return vetor;
    }
}
