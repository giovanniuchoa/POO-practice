public class Main {
    public static void main(String[] args) {

        //Definindo um objeto carro
        Carro meuCarro = new Carro("Renault Sandero", 2008, "Giovanni");
        Carro joaoCarro = new Carro("volks Gol", 2014, "João");

        Revenda lojinha = new Revenda("Hotelzin");

        lojinha.insereCarro(meuCarro);
        lojinha.insereCarro(joaoCarro);

        lojinha.mostraCarro();


    }
}