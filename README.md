# dio-controle-fluxo

# ContadorFluxo 

Este projeto em Java é um programa simples que solicita ao usuário dois números inteiros e conta entre eles, imprimindo os números intermediários.

## Descrição

O programa solicita dois parâmetros ao usuário:
1. O primeiro número (denominado "parametroUm").
2. O segundo número (denominado "parametroDois").

Em seguida, o programa conta do número `parametroUm` até `parametroDois`, imprimindo cada número da contagem no console. O código também verifica se `parametroDois` é maior do que `parametroUm` e, caso contrário, lança uma exceção personalizada `ParametrosInvalidosException`, exibindo uma mensagem de erro.

## Como funciona

1. O programa solicita dois números inteiros ao usuário através do terminal.
2. Se `parametroDois` for menor ou igual a `parametroUm`, será gerada uma exceção personalizada e uma mensagem de erro será exibida.
3. Caso contrário, o programa começa a contar do número `parametroUm` até `parametroDois` e imprime cada número da contagem.

## Exceção personalizada

- **ParametrosInvalidosException**: Essa exceção é disparada caso o segundo número fornecido (`parametroDois`) seja menor ou igual ao primeiro número fornecido (`parametroUm`). Uma mensagem de erro é impressa informando que o número deve ser maior.

## Pré-requisitos

- JDK 8 ou superior instalado para compilar e executar o código.

## Como usar

1. Clone este repositório ou baixe o arquivo `ContadorFluxo.java`.
2. Compile o código:
   ```bash
   javac ContadorFluxo.java
   ```
3. Execute o código compilado:
   ```bash
   java ContadorFluxo
   ```
4. O programa pedirá para você inserir dois números. O primeiro número será o ponto de partida e o segundo será o ponto de chegada da contagem.

## Exemplo de execução

```bash
$ java ContadorFluxo
Digite o número do parametro: 5
Digite o segundo numero: 10
Contando de 5 até 10:
Imprimindo o número 5
Imprimindo o número 6
Imprimindo o número 7
Imprimindo o número 8
Imprimindo o número 9
Imprimindo o número 10
```

### Tratamento de Exceções

Se o número inserido no segundo parâmetro for menor ou igual ao primeiro número, o programa exibirá a seguinte mensagem de erro:

```bash
$ java ContadorFluxo
Digite o número do parametro: 10
Digite o segundo numero: 5
"O segundo parâmetro deve ser maior que o primeiro"
```

## Arquivos

- `ContadorFluxo.java` – Código fonte do programa.



