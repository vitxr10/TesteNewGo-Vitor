function main(): void {
    const readlineSync = require('readline-sync');
  
    const quantidadePastas = readlineSync.questionInt('Digite a quantidade de pastas que deseja criar: ');
    console.log();
  
    const pastas: Pasta[] = [];
    for (let i = 0; i < quantidadePastas; i++) {
      console.log(`-----------------------------------PASTA ${i + 1}-----------------------------------`);
      const nomePasta = readlineSync.question('Digite o nome da pasta: ');
  
      const novaPasta = new Pasta(nomePasta);
      pastas.push(novaPasta);
  
      const quantidadeSubpastas = readlineSync.questionInt(`Digite a quantidade de subpastas que deseja criar em '${novaPasta.nome}': `);
  
      if (quantidadeSubpastas > 0) {
        criarSubpastas(readlineSync, novaPasta, quantidadeSubpastas);
      } else {
        const quantidadeArquivos = readlineSync.questionInt(`Digite a quantidade de arquivos que deseja adicionar à pasta '${novaPasta.nome}': `);
        criarArquivos(readlineSync, novaPasta, quantidadeArquivos);
      }
  
      const tamanhoPasta = novaPasta.calcularTamanhoTotal();
      console.log(`Tamanho da pasta '${novaPasta.nome}': ${tamanhoPasta}`);
      console.log();
    }
  
    let opcaoExcluir = readlineSync.question('Deseja excluir as pastas criadas? (S/N): ');
    while (!(opcaoExcluir.toUpperCase() === 'S') && !(opcaoExcluir.toUpperCase() === 'N')) {
      console.log('Opção inválida! Deseja excluir as pastas criadas? (S/N): ');
      opcaoExcluir = readlineSync.question();
    }
  
    if (opcaoExcluir.toUpperCase() === 'S') {
      for (const pasta of pastas) {
        pasta.excluir();
      }
      pastas.length = 0;
      console.log('Pastas excluídas.');
    }
  }
  
  function criarSubpastas(readlineSync: any, pastaPai: Pasta, quantidadeSubpastas: number): void {
    for (let i = 0; i < quantidadeSubpastas; i++) {
      console.log();
      const nomeSubpasta = readlineSync.question('Digite o nome da subpasta: ');
  
      const novaSubpasta = new Pasta(nomeSubpasta);
      pastaPai.adicionarSubpasta(novaSubpasta);
  
      const quantidadeArquivos = readlineSync.questionInt('Digite a quantidade de arquivos que deseja adicionar à subpasta: ');
  
      criarArquivos(readlineSync, novaSubpasta, quantidadeArquivos);
    }
  }
  
  function criarArquivos(readlineSync: any, pasta: Pasta, quantidadeArquivos: number): void {
    for (let i = 0; i < quantidadeArquivos; i++) {
      const nomeArquivo = readlineSync.question('Digite o nome do arquivo: ');
      const tipoArquivo = readlineSync.question('Digite o tipo do arquivo: ');
      const tamanhoArquivo = readlineSync.questionInt('Digite o tamanho do arquivo: ');
  
      const novoArquivo = new Arquivo(nomeArquivo, tipoArquivo, tamanhoArquivo);
      pasta.adicionarArquivo(novoArquivo);
    }
  }
  
  main();