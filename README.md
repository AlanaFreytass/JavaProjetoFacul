# JavaProjetoFacul
# Sistema de Cadastro de Alunos

Este projeto foi desenvolvido durante minha jornada na faculdade, como parte do aprendizado em Java e programação orientada a objetos (POO). O sistema é um cadastro de alunos simples, mas funcional, que permite gerenciar informações como nome, idade, curso e fase dos alunos, além de oferecer operações básicas como cadastro, edição, exclusão e visualização.

## O que o Sistema Faz?

- **Cadastrar Alunos**: Adiciona novos alunos ao sistema, com informações como nome, idade, curso e fase.
- **Editar Alunos**: Permite atualizar os dados de alunos já cadastrados.
- **Excluir Alunos**: Remove alunos do sistema.
- **Visualizar Alunos**: Lista todos os alunos cadastrados em uma tabela fácil de visualizar.
- **Validação de Dados**: Verifica se as informações inseridas são válidas, como nome com pelo menos 2 caracteres e idade maior que zero.

## Como o Projeto está Organizado?

Para facilitar o entendimento e a manutenção, o código foi dividido em pacotes:

- **Control**: Aqui fica a lógica que conecta a interface gráfica com o modelo, garantindo que tudo funcione de forma integrada.
- **DAO**: Simula o armazenamento de dados em uma lista em memória. No futuro, pode ser substituído por um banco de dados real.
- **Model**: Contém as classes que representam os alunos e pessoas, com atributos e métodos relacionados.
- **View**: As telas do sistema foram criadas aqui, usando Swing para a interface gráfica.
- **Principal**: É o ponto de partida do sistema, onde a aplicação é iniciada.
## Quem Fez?

Este projeto foi desenvolvido por Alana Fernanda Freitas, como parte do meu aprendizado em Java durante a faculdade.
