import java.util.ArrayList;

public class Revenda {
    private String nome;
    private ArrayList<Carro> listaCarros;

    //Construtor
    public Revenda (String nome){
        this.nome = nome;
        this.listaCarros = new ArrayList<>();
    }
    public void insereCarro(Carro pocante){
        listaCarros.add(pocante);
    }
    public void mostraCarro(){
        for (Carro i:listaCarros){
            System.out.println(i.getMarca()+" "+i.getAno());
        }
    }
}

