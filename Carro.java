//Classe
public class Carro {
    private String marca;
    private int ano;
    private String dono;

    //Construtor
    public Carro(String marca, int ano, String dono) {
        this.marca = marca;
        this.ano = ano;
        this.dono = dono;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}


