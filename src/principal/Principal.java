package principal;

import entidade.Cofre;
import entidade.Moeda;

public class Principal {

	public static void main(String[] args) {
		Cofre cofrinho = new Cofre();
		cofrinho.adicionarMoeda(new Moeda(10.00));
		cofrinho.adicionarMoeda(new Moeda(10.00));
		cofrinho.adicionarMoeda(new Moeda(25.00));
		cofrinho.adicionarMoeda(new Moeda(50.00));
		cofrinho.adicionarMoeda(new Moeda(50.00));
		cofrinho.calcularTotal();
		cofrinho.qtdMoeda();
		cofrinho.qtdMoedaValor(50.00);
		cofrinho.obterMoedaMaiorValor();
	}

}
