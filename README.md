# DesafioPubFuture

Iniciando o projeto pela primeira vez

1) Apos fazer o clone do repositorio abra o eclipse ide e importe o projeto como um projeto maven existente

![image](https://user-images.githubusercontent.com/33501705/149663989-7fe96e52-41c1-45b0-a528-e0aecea44330.png)

2)Abrir o XAMPP e iniciar o modulo do MySQL

![image](https://user-images.githubusercontent.com/33501705/149664081-61821364-32b2-4b7f-b118-dd3fc7dee3a2.png)

3)criar um banco de dados com o nome de "financasdb" 


4)clicar com o botão direito na pasta origem do projeto e rodar ele com maven install

![image](https://user-images.githubusercontent.com/33501705/149664244-1868b09b-4e05-4ad3-b305-ce71eefbe447.png)

5)clicar com o botão direito no FinancasApplication.java e executar como aplicação java

![image](https://user-images.githubusercontent.com/33501705/149664321-342f31e2-2ada-4cd2-adfc-2530cb75f617.png)

Apos fazer esse processo ele vai criar as tabelas no banco financasdb e ja podera ser utilizado, caso queira rodar uma outra hora é so refazer o passo 5



Para utilizar as api basta utilizar algum programa como postman e enviar um post pelo link http://localhost:8080/cadastrarTipoConta para cadastrar um tipo de conta.

![image](https://user-images.githubusercontent.com/33501705/149664755-37ae00d9-ff3a-43bb-9cd4-7072df5bfecc.png)

Para cadastrar nova conta 

![image](https://user-images.githubusercontent.com/33501705/149664839-623582fe-019f-454f-965f-f21d904e23c0.png)

e assim segue com todos as api que esta nas classes controller apenas alterando a escrita apos o "/" por um dos comandos que esta no request mapping

![image](https://user-images.githubusercontent.com/33501705/149664952-bf26844a-7d38-49f0-ad0c-29baec7d9626.png)


o formato json para cada tipo de cadastro

Adicionar tipos:

{
    "nome": "Carteira"
}

Adicionar conta:

{
    "instituicaoFinanceira": "instituição 01",
    "saldo": 300,
    "tipoConta": {"id": 1}
}

Adicionar despesas:

{
    "dataPagamento": "13/01/2022",
    "dataPagamentoEsperado": "13/01/2022",
    "valor": "99.50",
    "conta" : {"id":1},
    "tipoDespesa":{"id": 1}
}

Adicionar receita:

{
    "dataRecebimento": "5/02/2022",
    "dataRecebimentoEsperado": "5/02/2022",
    "descricao": "Salario do mes 01",
    "valor": "1200",
    "conta" : {"id": 1},
    "tipoReceita":{"id": 1}
}
