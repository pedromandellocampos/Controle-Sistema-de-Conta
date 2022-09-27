package com.algaworks.cursojava.financeiro.modelo;

import com.algaworks.cursojava.arquivoprincipal.SituacaoConta;

public abstract class Conta {
	
	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	
	protected SituacaoConta situacaoConta;
		
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void cancelar(){
		System.out.println(descricao + " - Valor: " + valor + " - Data de vencimento: " + dataVencimento);
			
		if(situacaoConta == SituacaoConta.PAGA || situacaoConta == SituacaoConta.CANCELADA) {
			System.out.println("Erro: Só é possível pagar uma conta pendente");
		} else {
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Conta paga com sucesso");
		}
		
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}
	
	public abstract void exibirDetalhes();
	
}
