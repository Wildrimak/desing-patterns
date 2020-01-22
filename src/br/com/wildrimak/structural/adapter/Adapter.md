#Adapter

Padrão utilizado para quando se quer acessar uma API externa cuja interface dela não é suportada pelo seu sistema atual mas você quer que suporte.

## Objetivo

Fazer o comportamento de uma classe que você não controla ter o comportamento que você espera.

## Como fazer

Exemplo digamos que tenhamos uma ClasseInacessivel.

Então você cria uma classe do jeito que você quer que ela seja tal como  ClasseComoQuero.

Pra acessar a API da ClasseInacessivel você irá fazer uma classe intermediária que manterá o comportamento da ClasseInacessivel, só que em outra classe, nesse caso a AdapterClasseInacessivel.

Fazendo AdapterClasseInacessivel ser filha, ou seja herança, da ClasseInacessivel você tem uma copia do comportamento dela. Só que ao invés de adicionar novas funções para a classe, você irá sobrescrever todos os métodos da classe original;

Para fazer com que os metodos da AdapterClasseInacessivel tenha o comportamento da ClasseComoQuero você faz a AdapterClasseInacessivel ter em seu construtor a classe que você quer, no caso ClasseComoQuero. 

Assim como você tem uma referencia da ClasseComoQuero em seu AdapterClasseInacessivel, cada metodo que seu AdapterClasseInacessivel sobrescreve irá retornar ou fazer uma chamada a ao metodo da ClasseComoQuero      

Assim o seu adapter é um ClasseInacessivel só que com o comportamento da ClasseComoQuero.

Dessa forma se atinge o objetivo de utilizar a classe original tendo os comportamentos que você quer.