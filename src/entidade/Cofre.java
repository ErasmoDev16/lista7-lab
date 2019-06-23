package entidade;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cofre {

	private Map<Moeda, Integer> lista = new HashMap<>();

	public Cofre() {
		this.lista = new HashMap<>();
	}

	public void adicionarMoeda(Moeda moeda) {

		lista.put(moeda, 1);
	}

	public void calcularTotal() {

		Double total = 0.00;

		Set<Moeda> chaves = lista.keySet();

		for (Moeda m : chaves) {

			total += m.getValor() * lista.get(m);
		}

		System.out.println("Valor total R$:"+total/100);

	}

	public void qtdMoeda() {
		Integer total = 0;

		Set<Moeda> quantidade = lista.keySet();

		for (Moeda m : quantidade) {
			total += lista.get(m);
		}

		System.out.println("Total de moedas no cofre: "+total);

	}

	public void qtdMoedaValor(Double valor) {

		Integer total = 0;

		Set<Moeda> moedas = lista.keySet();

		for (Moeda m : moedas) {
			if (valor.equals(m.getValor())) {

				total += lista.get(m);

			}

		}

		System.out.printf("Moedas de %.0f centavos adicionadas no cofre: %s\n",valor,total);
	}

	public void obterMoedaMaiorValor() {

		Double maior = 0.00;

		Set<Moeda> valor = lista.keySet();

		for (Moeda m : valor) {
			if (maior < m.getValor() && lista.get(m) != 0) {
				
				maior = m.getValor();
			}

		}

		System.out.printf("Moeda de maior valor no cofre %.0f",maior);

	}

}