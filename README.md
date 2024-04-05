Sistema de Agência de Viagens.

Este projeto consiste em um sistema desenvolvido em Java para uma agência de viagens. O sistema é capaz de registrar pacotes de viagens e dados de vendas. Cada pacote de viagens é composto por meio de transporte e hospedagem, onde cada meio de transporte possui um tipo e um valor, e cada hospedagem possui uma descrição e um valor de diária. Os valores dos pacotes de viagem são calculados a partir dos valores do transporte e da hospedagem, somados a uma margem de lucro e taxas adicionais.

Funcionalidades
O sistema possui as seguintes funcionalidades:

Cadastro de Pacotes de Viagens: O sistema permite cadastrar pacotes de viagens informando o meio de transporte, hospedagem, destino e quantidade de dias. Ele é capaz de calcular o total da hospedagem a partir do número de dias e o valor da diária, calcular o valor de lucro a partir de uma margem informada e calcular e retornar o total do pacote, somando o transporte, o total da hospedagem e os valores adicionais de margem de lucro e taxas.

Cadastro de Vendas: O sistema permite cadastrar vendas informando o nome do cliente, forma de pagamento e o pacote de viagem vendido. Ele é capaz de converter um valor em reais a partir de um valor informado em dólar e da cotação da moeda, e mostrar na tela o total do pacote de viagem em dólar e em reais.

Estrutura do Projeto
O projeto está estruturado com as seguintes classes:

Classe Transporte: Representa o meio de transporte com tipo e valor.
Classe Hospedagem: Representa a hospedagem com descrição e valor de diária.
Classe PacoteViagem: Representa o pacote de viagem com transporte, hospedagem, destino e quantidade de dias. É capaz de realizar cálculos relacionados ao pacote de viagem.
Classe Venda: Representa uma venda com nome do cliente, forma de pagamento e pacote de viagem.
Como Executar
Para executar o sistema, é necessário utilizar o NetBeans ou qualquer outra IDE Java compatível. Basta criar um novo projeto Java do tipo console e copiar e colar o código fornecido nas classes.

Após a execução do sistema, será possível interagir com o usuário para cadastrar pacotes de viagens e realizar vendas, conforme as funcionalidades descritas.

Autor
Este projeto foi desenvolvido por Matheus Leal.

Licença
Este projeto está licenciado sob a Licença MIT, o que significa que você pode usar, modificar e distribuir o código livremente, desde que mantenha o aviso de direitos autorais e a licença original.

Este README.md fornece uma visão geral do projeto, suas funcionalidades, estrutura, instruções de execução e informações sobre o autor e a licença. Certifique-se de ajustar conforme necessário para atender aos requisitos específicos do projeto.
