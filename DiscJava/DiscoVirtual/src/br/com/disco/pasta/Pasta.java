package br.com.disco.pasta;

import java.util.ArrayList;
import java.util.List;
import br.com.disco.arquivo.Arquivo;

public class Pasta {
	 private String nome;
	    private List<Arquivo> arquivos;
	    private List<Pasta> subpastas;

	    public Pasta(String nome) {
	        this.nome = nome;
	        arquivos = new ArrayList<>();
	        subpastas = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public List<Arquivo> getArquivos() {
	        return arquivos;
	    }

	    public List<Pasta> getSubpastas() {
	        return subpastas;
	    }

	    public void adicionarArquivo(Arquivo arquivo) {
	        arquivos.add(arquivo);
	    }

	    public void adicionarSubpasta(Pasta pasta) {
	        subpastas.add(pasta);
	    }

	    public int calcularTamanhoTotal() {
	        int tamanhoTotal = 0;

	        for (Arquivo arquivo : arquivos) {
	            tamanhoTotal += arquivo.getTamanho();
	        }

	        for (Pasta subpasta : subpastas) {
	            tamanhoTotal += subpasta.calcularTamanhoTotal();
	        }

	        return tamanhoTotal;
	    }

	    public void excluir() {
	        for (Arquivo arquivo : arquivos) {
	            // L�gica para excluir o arquivo
	            System.out.println("Excluindo arquivo: " + arquivo.getNome());
	        }

	        for (Pasta subpasta : subpastas) {
	            subpasta.excluir();
	        }

	        // L�gica para excluir a pasta atual
	        System.out.println("Excluindo pasta: " + nome);
	    }
}
