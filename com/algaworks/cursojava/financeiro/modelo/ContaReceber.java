package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.arquivoprincipal.SituacaoConta;


public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public void receber() {
		System.out.println(descricao + " - Valor: " + valor + " - Data de vencimento: " + dataVencimento + " - Cliente: " + cliente.getNome());
		
		if(situacaoConta == SituacaoConta.PAGA || situacaoConta == SituacaoConta.CANCELADA) {
			System.out.println("Erro: Só é possível receber de uma conta pendente");
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Conta recebida com sucesso");
		}
	}
	
	
	public void cancelar() {
		if(this.valor < 50000) {
			super.cancelar();
		} else {
			System.out.println("Nao e possivel cancelar contar acima de R$ 50.000,00");
		}
	}
	
	public void exibirDetalhes() {
 		
		System.out.println("Tipo: Conta a receber ---- Cliente: " + cliente.nome + "Descricao: " + descricao + " ---- Valor: R$" + valor + " Data de Vencimento: " + dataVencimento);
		
	}
	
	public ContaReceber () {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.cliente = cliente;
		this.situacaoConta = SituacaoConta.PENDENTE;
		
	}
	
}
