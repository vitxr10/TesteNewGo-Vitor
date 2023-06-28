package br.com.disco.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.disco.arquivo.Arquivo;
import br.com.disco.pasta.Pasta;

public class Teste {

	public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pastas que deseja criar: ");
        int quantidadePastas = scanner.nextInt();
        System.out.println();

        List<Pasta> pastas = new ArrayList<>();
        for (int i = 0; i < quantidadePastas; i++) {
            System.out.println("-----------------------------------PASTA " + (i + 1) + "-----------------------------------");
            System.out.print("Digite o nome da pasta: ");
            String nomePasta = scanner.next();

            Pasta novaPasta = new Pasta(nomePasta);
            pastas.add(novaPasta);

            System.out.print("Digite a quantidade de subpastas que deseja criar em '" + novaPasta.getNome() + "': ");
            int quantidadeSubpastas = scanner.nextInt();

            if (quantidadeSubpastas > 0) {
                criarSubpastas(scanner, novaPasta, quantidadeSubpastas);
            } else {
                System.out.print("Digite a quantidade de arquivos que deseja adicionar à pasta '" + novaPasta.getNome() + "': ");
                int quantidadeArquivos = scanner.nextInt();
                criarArquivos(scanner, novaPasta, quantidadeArquivos);
            }

            int tamanhoPasta = novaPasta.calcularTamanhoTotal();
            System.out.println("Tamanho da pasta '" + novaPasta.getNome() + "': " + tamanhoPasta);
            System.out.println();
        }

        System.out.print("Deseja excluir as pastas criadas? (S/N): ");
        String opcaoExcluir = scanner.next();
        while(!(opcaoExcluir.equalsIgnoreCase("S")) && !(opcaoExcluir.equalsIgnoreCase("N"))) {
        	System.out.println("Opção inválida! Deseja excluir as pastas criadas? (S/N): ");
        	opcaoExcluir = scanner.next();
        }

        if (opcaoExcluir.equalsIgnoreCase("S")) {
            for (Pasta pasta : pastas) {
                pasta.excluir();
            }
            pastas.clear();
            System.out.println("Pastas excluídas.");
        }

        scanner.close();
    }

    private static void criarSubpastas(Scanner scanner, Pasta pastaPai, int quantidadeSubpastas) {
        for (int i = 0; i < quantidadeSubpastas; i++) {
            System.out.println();
            System.out.print("Digite o nome da subpasta: ");
            String nomeSubpasta = scanner.next();

            Pasta novaSubpasta = new Pasta(nomeSubpasta);
            pastaPai.adicionarSubpasta(novaSubpasta);

            System.out.print("Digite a quantidade de arquivos que deseja adicionar à subpasta: ");
            int quantidadeArquivos = scanner.nextInt();

            criarArquivos(scanner, novaSubpasta, quantidadeArquivos);
        }
    }

    private static void criarArquivos(Scanner scanner, Pasta pasta, int quantidadeArquivos) {
        for (int i = 0; i < quantidadeArquivos; i++) {
            System.out.print("Digite o nome do arquivo: ");
            String nomeArquivo = scanner.next();

            System.out.print("Digite o tipo do arquivo: ");
            String tipoArquivo = scanner.next();

            System.out.print("Digite o tamanho do arquivo: ");
            int tamanhoArquivo = scanner.nextInt();

            Arquivo novoArquivo = new Arquivo(nomeArquivo, tipoArquivo, tamanhoArquivo);
            pasta.adicionarArquivo(novoArquivo);
        }
    }
    }

	


