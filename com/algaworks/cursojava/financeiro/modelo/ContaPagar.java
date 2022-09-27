package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.arquivoprincipal.SituacaoConta;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void pagar(){
		System.out.println(descricao + " - Valor: " + valor + " - Data de vencimento: " + dataVencimento + " - Fornecedor: " + fornecedor.getNome());
			
		if(situacaoConta == SituacaoConta.PAGA || situacaoConta == SituacaoConta.CANCELADA) {
			System.out.println("Erro: Só é possível pagar uma conta pendente");
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println("Conta paga com sucesso");
		}
	}
		
	public void exibirDetalhes() {
 		
		System.out.println("Tipo: Conta a Pagar ---- Fornecedor: " + fornecedor.nome + " Descricao: " + descricao + " ---- Valor: R$" + valor + " Data de Vencimento: " + dataVencimento);
		
	}
		
	public ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento ){
		
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
		this.situacaoConta = SituacaoConta.PENDENTE;
					
	}


	
	
}
