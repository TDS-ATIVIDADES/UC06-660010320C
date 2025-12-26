# Seleção de Auditório para Eventos

Relativo ao atendimento de eventos, o hotel necessita de uma funcionalidade que indique qual de seus dois auditórios é o mais adequado para um evento.

## Descrição dos Auditórios

- **Auditório Alfa**: Conta com 150 lugares e espaço para até 70 cadeiras adicionais.
- **Auditório Beta**: Conta com 350 lugares, sem espaço para mais cadeiras.

## Requisitos do Programa

Desenvolva um programa Java que receba o número de convidados do evento e faça uma verificação sobre esse número:

- Se for maior que 350 ou menor que zero, deverá ser mostrada a mensagem "Número de convidados inválido".
- Se o valor informado é válido, deverá ser mostrado na tela qual dos auditórios é o mais adequado.
- No caso do auditório Alfa, será preciso calcular ainda quantas cadeiras adicionais serão necessárias, observando o limite citado anteriormente.

## Como executar

Para executar o programa, certifique-se de ter o Java instalado. Navegue até a pasta `Auditorio` e execute os seguintes comandos:

```bash
javac App.java
java App
```