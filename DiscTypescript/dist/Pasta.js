"use strict";
class Pasta {
    constructor(nome) {
        this.nome = nome;
        this.arquivos = [];
        this.subpastas = [];
    }
    adicionarArquivo(arquivo) {
        this.arquivos.push(arquivo);
    }
    adicionarSubpasta(subpasta) {
        this.subpastas.push(subpasta);
    }
    calcularTamanhoTotal() {
        let tamanhoTotal = 0;
        for (const arquivo of this.arquivos) {
            tamanhoTotal += arquivo.tamanho;
        }
        for (const subpasta of this.subpastas) {
            tamanhoTotal += subpasta.calcularTamanhoTotal();
        }
        return tamanhoTotal;
    }
    excluir() {
        for (const arquivo of this.arquivos) {
            // Lógica para excluir o arquivo
            console.log(`Excluindo arquivo: ${arquivo.nome}`);
        }
        for (const subpasta of this.subpastas) {
            subpasta.excluir();
        }
        // Lógica para excluir a pasta atual
        console.log(`Excluindo pasta: ${this.nome}`);
    }
}
module.exports = Pasta;
//# sourceMappingURL=Pasta.js.map