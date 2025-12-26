# Sistema de Agência de Viagens

## Descrição

A empresa de desenvolvimento retorna ao projeto de desenvolvimento de sistema para uma agência de viagens. Esse sistema precisa registrar pacotes de viagens e dados de uma venda. Cada pacote de viagens é formado pelo meio de transporte e pela hospedagem – cada meio de transporte tem tipo e valor e cada hospedagem tem tipo e valor. Os valores de pacote de viagem são formados pelos valores do transporte e da hospedagem somados a uma margem de lucro e taxas adicionais.

A venda inclui dados do cliente, forma de pagamento, data e pacote sendo vendido e precisa ser capaz de converter o valor do pacote em reais para dólar e vice-versa.

Sua tarefa será aplicar orientação a objetos para desenvolver um módulo em Java desse sistema.

## Atividade

No NetBeans, crie um projeto Java (tipo console) com os seguintes itens:

### Classes

- **Classe para transporte**: com o tipo (aéreo, rodoviário, marítimo etc.) e valor
- **Classe para hospedagem**: com descrição e valor de diária
- **Classe para pacote de viagem**: com transporte, hospedagem, destino (texto), quantidade de dias. Essa classe ainda deve ser capaz de:
  - Calcular o total de hospedagem a partir do número de dias e o valor da diária.
  - Calcular valor de lucro a partir de uma margem informada (porcentagem) e valor informado. O resultado retornado deve ser o valor + margem aplicada ao valor.
  - Calcular e retornar o total do pacote, somando o transporte, o total da hospedagem e os valores adicionais informados – margem de lucro (porcentagem) e taxas adicionais (valor monetário).
  - **Observação**: os valores nesta classe serão considerados em dólar.
- **Classe para venda**: que contenha nome do cliente, forma de pagamento e pacote de viagem. A classe deve ser capaz de:
  - Converter um valor em reais a partir de um valor informado em dólar e da cotação da moeda, também informada.
  - Mostrar na tela o total do pacote de viagem em dólar e em reais.

### Classe Principal

Na classe principal, elabore código para interação com o usuário em que seja possível “cadastrar” uma venda e:

- Obtenha todos os valores necessários para criar um pacote de viagem e crie esse objeto.
- Mostre na tela as informações do pacote criado, incluindo o valor total. O usuário ainda precisará informar margem de lucro (uma porcentagem).
- Obtenha do usuário também as informações para a criação de uma venda.
- Mostre na tela todas as informações da venda, incluindo valor total em dólar e valor em reais (o usuário terá que informar a cotação do dólar no dia).

**Recomendação**: Use construtores nas classes.