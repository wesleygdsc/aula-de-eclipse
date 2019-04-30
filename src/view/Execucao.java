package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
	
	public static void main (String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setCpf(32525542);
		System.out.println(pf.getCpf());
		pf.setEndereco("Rua duarte de lemos");
		System.out.println(pf.getEndereco());
		pf.setBairro("jardim Silva");
		System.out.println(pf.getBairro());
		pf.setEstado("São Paulo");
		System.out.println(pf.getCep());
		pf.setCep(8141240);
		System.out.println(pf.getEstado());
		pf.setTelefone(25686324);
		System.out.println(pf.getTelefone());
		pj.setCnpj(454548);
		System.out.println(pj.getCnpj());
		
		
	}

}