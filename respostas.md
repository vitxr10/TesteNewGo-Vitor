1. Apesar da herança ser uma ferramenta útil na programação orientada a objetos, ela possui alguns contras na sua utilização:
* Rigidez: a herança cria uma relação permanente entre as classes pais e filhas, qualquer alteração na classe pai pode impactar as classes filhas, exigindo modificações em várias partes do código.
* Hierarquia confusa: á medida que a hierarquia de herança cresce, fica mais difícil de entender as relações entre as classes e a lógica envolvida.
Uma alternativa para evitar a herança em certos relacionamentos é usar a composição. A composição permite construir classes combinando objetos de outras classes, em vez de herdar seu comportamento.
Por exemplo, em uma classe "Carro" que tem um atributo "motor" que é instancia da classe "Motor". Em vez de herdar o comportamento do motor, o carro utiliza a composição, delegando a tarefa de ligar o motor ao objeto da classe "Motor" associada.

2. Nesse caso, eu utilizaria o padrão de projeto Adapter para fazer a classe final se adequar a interface esperada na estrutura de polimorfismo.

3. Suponhamos que estamos trabalhando em um sistema de cache de dados que armazena os resultados de consulta a um database e queremos melhorar o desempenho dele. Nesse caso, podemos usar um Proxy como cache para os resultados das consultas, ele seria responsável por verificar se uma consulta já foi feita e se os dados ainda estão disponiveis no cache. Caso contrário, o Proxy encaminha a solicitação e executa a consulta e armazena os resultados antes de retorná-los.

4. Depende do contexto e requisitos do projeto. Um pró do Anêmico é sua modelagem simples com foco nas propriedades e operações dos objetos, um contra é o comportamento disperso, pois no Anêmico a lógica de negócio é distribuida em varios componentes, tornando o entendimento mais difícil.
Um pró do domínio Rico é o encapsulamento, as regras de negócio são encapsuladas nos objetos, permitindo que mantenham suas invariantes internamente. Um contra á a complexidade, pois ele exige um entendimento mais aprofundado da lógica de negócio.

5. Suponhamos que estamos desenvolvendo um sistema de pagamento que lida com diversos tipos de transações, e desejamos que o sistema seja extensível para acomodar novas formas de transações futuramente sem modificar o código. Para isso podemos usar o OCP para criar uma abstração que represente as transações e implemente as classes para cada tipo de transação. 

6. Os requisitos funcionais descrevem ações específicas que são esperadas pelo o usuário que o sistema realize. Exemplo: num sistema de lista de tarefas é esperado a ação: "Criar tarefa".
Os requisitos não-funcionais definem características do sistema, como o desempenho, segurança, etc. Um exemplo seria um padrão de layout das telas do sistema de lista de tarefas.
As regras de negócio são as diretrizes e restrições que regem as características de um sistema. Exemplo: em um sistema de controle de estoque uma regra de negócio pode ser: "Se a quantidade de um produto estiver abaixo do estoque mínimo, o sistema deve emitir um alerta para o gerente de estoque solicitar uma nova compra."

7. Eu gosto de utilizar Diagramas de Classes em meus projetos, pois acho mais simples e fácil de vizualizar, por listas todas as classes e seus atributos, além de métodos e relacionamentos.

8. Etapas para fazer uma alteração:
1- Atualizar repositorio local
2- Criar nova branch para alteração
3- Fazer alterações
4- Fazer commit das alterações
5- Fazer o push da branch para o repositorio remoto
6- Abrir um pull request
7- Fazer o merge das alterações

9. Para  que uma funcionalidade seja considerada como 'done' geralmente tenho que concluir essas etapas: 
1- Compreender os requisitos
2- Planejar a implantação
3- Codificar a funcionalidade
4- Testar
5- Corrigir bugs e rafatorar o código
6- Documentar a funcionalidade
7- Revisar com outros membros da equipe
8- Integrar a funcionalidade a branch principal ou a branch develop
9- Testar novamente
10- Marcar como 'done'

10. Nas cerimônias do SCRUM temos o Sprint Planning que é muito importante porque é nessa hora que é realizado o planejamento da sprint. O Daily Scrum que é importante para manter o time alinhado com as tasks. A Sprint Review que também é muito relevante para receber os feedbacks dos participantes e melhorar as próximas entregas. Por fim a Sprint Retrospective que é importante para promover uma melhoria contínua da equipe.

11. Eu já ouvi falar de Docker, que é uma plataforma de código aberto que permite executar arquivos em contêiners e tal, mas nunca utilizei em um projeto meu.
