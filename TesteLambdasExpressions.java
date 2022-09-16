package lambdas;

import java.util.ArrayList;
import java.util.List;

public class TesteLambdasExpressions {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		lista.forEach((Conta) -> System.out.println(Conta.getNumero()));//lambda expression para exibir todos os números de contas da lista.
		
		lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) ); // lambda para ordenar a lista por ordem crescente do número de contas
		
		System.out.println("-----------------------------");
		
		lista.forEach((Conta) -> System.out.println(Conta.getNumero()));//lambda expression para exibir todos os números de contas da lista.
	
	}

}
