# Exercícios Aula 14 - DB1 Start 2019


<h3>Exercício de encapsulamento e abstração</h3><br>

1 - Implementar a abstração e o encapsulamento de um software de pedidos:

    - Criar um projeto chamado pedidos<br>
    - Um pedido pode estar cancelado, aberto ou faturado
    - Um pedido é de um cliente
    - Quero saber quando o pedido foi faturado e quando o pedido foi cancelado
    - Apenas pedidos com status aberto podem ser alterados
    - Um pedido deve ter no mínimo um item e no máximo 10 itens
    - O cliente deve estar ativo para fazer um pedido
    - Um produto deve estar ativo para ser adicionado a um pedido
    - Não vamos fazer controle de estoque no sistema, por enquanto :)
    - No final preciso de dois relatórios:
        - relatório 1:
            - Número pedido
            - Data pedido	
            - Status
            - Data faturamento ou cancelamento
            - Total de itens do pedido
            - Valor total do pedido
        - Relatório 2:
            - Número pedido
            - Data pedido
            - Status
            - Data faturamento ou cancelamento
            - Total de itens do pedido
            - Valor total do pedido
            - Itens do pedido com:
                - Código produto
                - Descrição
                - Valor
                - Quantidade
                - Total

