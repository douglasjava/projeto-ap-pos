## Projeto Acme Producer (AP)


####  Cenário de Estudo
Uma empresa do ramo de energia elétrica denominada Acme Producer (AP) tem um processo de negócio em comum onde é necessária uma integração entre sistemas.
O sistema da empresa AP produz as seguintes informações:
-	Dados de cliente: CPF, nome, data de nascimento, endereço de cobrança;
-	Dados de instalação: código da instalação, endereço da instalação;
-	Dados de Fatura: código da fatura, código da instalação, CPF do cliente, data de vencimento, data de leitura, valor da leitura, valor da conta;
 
Todas as informações acima são disponibilizadas através de uma API Rest pela empresa AP. 
Os clientes da empresa AP precisam registrar as informações de suas contas de energia. Para tal, realizam uma integração com a empresa AP em que recuperam as informações consumindo a API e importam para seu banco de dados para auditoria posterior.
Os serviços oferecidos pela empresa AP estão listados abaixo:

#### Cliente:
-	Consultar a lista de clientes cadastrados;
-	Consultar cliente cadastrado pelo seu CPF;
-	Cadastrar um cliente.
#### Instalações
-	Consultar a lista de instalações cadastradas;
-	Consultar uma instalação pelo seu código;
-	Consultar instalações de um cliente pelo CPF;
-	Cadastrar uma instalação.
#### Faturas:
-	Consultar a lista de faturas geradas;
-	Consultar fatura cadastrado pelo seu código;
-	Consultar faturas de um cliente pelo CPF;
-	Gerar uma fatura.



#### Configurations

Open file `application.properties` file contains informations for conections.

#### Requirements

- Java 11
- Maven > 3.0
- Spring 2.4.3 `pom.xml`
- h2 em memoria

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

