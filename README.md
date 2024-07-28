# Trilha Java bootcamp - DIO / Claro

> [!NOTE]
> Este repositório é dedicado a uma trilha de aprendizado em Java com Spring Boot, cobrindo todo o processo do Bootcamp. A participação inclui projetos que evoluem gradativamente, começando com a sintaxe básica, passando pela Programação Orientada a Objetos (POO) e culminando no uso do framework open source Spring Boot.
> Cada desafio foi proposto pelo bootcamp DIO.
> https://github.com/digitalinnovationone/trilha-java-basico

## Sintaxe - Desafio

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

| Atributo     | Tipo    | Exemplo       |
| ------------ | ------- | ------------- |
| Numero       | Inteiro | 1021          |
| Agencia      | Texto   | 067-8         |
| Nome Cliente | Texto   | MARIO ANDRADE |
| Saldo        | Decimal | 237.48        |

###### Revise sobre terminal, main args e a classe Scanner

2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

- Programa: "Por favor, digite o número da Agência !"
- Usuário: 1021 _(depois ENTER para o próximo campo)_

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

## Controle de Fluxo - Desafio

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

- Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.
