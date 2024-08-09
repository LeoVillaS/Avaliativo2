# Avaliativo2

## Descrição do Projeto

Este projeto é um sistema simples de gerenciamento de produtos, onde podemos criar, atualizar e visualizar as informações de produtos de forma prática. A ideia é que o sistema seja funcional e fácil de usar, utilizando o padrão de design Facade para simplificar a interação com as várias partes do sistema.

## Descrição do Problema Solucionado pelo Facade

Quando temos um sistema com várias classes interagindo entre si, como o modelo, a visualização e o controlador, as coisas podem ficar um pouco complicadas. Se cada parte do sistema precisar falar diretamente com todas as outras, o código pode ficar confuso e difícil de manter. O Facade resolve isso criando uma interface única e simplificada, escondendo toda a complexidade por trás de uma "fachada" (daí o nome). Isso torna o sistema mais fácil de usar e entender.

## Funcionalidade do Facade no Sistema

No nosso sistema, o Facade funciona como um intermediário que junta todas as operações principais em um único lugar. Em vez de chamar métodos do modelo, da visualização e do controlador diretamente, você só precisa falar com o ProdutoFacade, que cuida de tudo por você. Isso simplifica muito as operações e reduz a chance de erro, porque você não precisa se preocupar com os detalhes internos do sistema.

## Como o Facade foi Implementado e Sua Contribuição

O ProdutoFacade foi implementado como uma classe que agrupa todas as interações importantes com o sistema de produtos. Ele tem métodos como criarProduto, atualizarProduto e exibirProduto, que internamente chamam os métodos das outras classes (Produto, ProdutoView, ProdutoController). Isso significa que, em vez de lidar diretamente com várias classes e métodos, o usuário só precisa interagir com o ProdutoFacade, tornando a experiência mais fluida e o código mais limpo.
