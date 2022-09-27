package com.algaworks.cursojava.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		// codifique a listagem e detalhamento aqui
		
		for(int i = 0; i < contas.length; i++) {
			
			if(contas[i] instanceof ContaReceber) {
			
				ContaReceber cr = (ContaReceber) contas[i];
				cr.exibirDetalhes();
				
			} else if (contas[i] instanceof ContaPagar) {
				
				ContaPagar cp = (ContaPagar) contas[i];
				cp.exibirDetalhes();
				
			}
		
		}
	
	}
}
