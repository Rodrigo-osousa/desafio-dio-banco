<h1>Desafio DIO Banco</h1>

Este projeto foi desenvolvido mediante ao um desafio lançado na plataforma Digital innovation One.

Tem como objetivo criar um banco com algumas funções para melhor abstração de linguagem Java orientada a objetos.

O projeto cria uma conta corrente e uma conta poupanca para um cliente, possui também um método de transferência de valores entre as contas.

Implementei uma exception para caso o cliente não possua saldo, não consiga realizar a transferência.

Também podemos rodar o projeto no Docker conforme orientações abaixo:

Após baixar e extrair o repositótio, abra o terminal na pasta src e execute o seguinte comando:

```docker build -t desafio-dio-banco-java-app .```

Depois que o processo terminar, execute:

```docker run -it --rm --name my-running-app desafio-dio-banco-java-app```

Como resultado final temos um comprovante dos valores em cada conta, sendo que internamente foi criado uma conta corrente e outra poupança, posteriormente depositado R$ 100,00 na conta corrente e realizado uma tranferência de mesmo valor para conta poupança.
