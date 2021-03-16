---ENDEREÇO----

insert into ENDERECO (id, cep, logradouro, numero, complemento, bairro, cidade) values (1, '32141012', 'Rua San Marino', '122', 'casa', 'Parque Airton Senna', 'Contagem');
insert into ENDERECO (id, cep, logradouro, numero, complemento, bairro, cidade) values (2, '32230020', 'Rua Tiradentes', '1563', 'loja', 'Industrial', 'Contagem');
insert into ENDERECO (id, cep, logradouro, numero, complemento, bairro, cidade) values (3, '32110000', 'Avenida Princesa Isabel', '350', 'apto 402', 'Parque Recreio', 'Contagem');
insert into ENDERECO (id, cep, logradouro, numero, complemento, bairro, cidade) values (4, '32280270', 'Avenida Francisco Firmo de Matos', '50', 'loja', 'Riacho das Pedras', 'Contagem');
insert into ENDERECO (id, cep, logradouro, numero, complemento, bairro, cidade) values (5, '33233084', 'Rua João Batista Salomão', '30', 'casa', 'Várzea', 'Lagoa Santa');

---CLIENTE----

insert into CLIENTE (id, cpf, nome, data_nascimento) values (1, '10146710606', 'Douglas Marques Dias', '1991-07-26');
insert into CLIENTE (id, cpf, nome, data_nascimento) values (2, '29114825732', 'João da Silva', '1986-01-15');
insert into CLIENTE (id, cpf, nome, data_nascimento) values (3, '24844464892', 'Maria Ferreira', '1975-11-10');
insert into CLIENTE (id, cpf, nome, data_nascimento) values (4, '16203610356', 'Débora de Oliveira', '1997-04-03');

---INSTALAÇÃO----

insert into INSTALACAO (id, data_instalacao, id_endereco_cobranca, id_cliente) values (1,'2019-12-01T20:34:04Z', 1, 3);
insert into INSTALACAO (id, data_instalacao, id_endereco_cobranca, id_cliente) values (2,'2020-12-01T20:34:04Z', 2, 2);
insert into INSTALACAO (id, data_instalacao, id_endereco_cobranca, id_cliente) values (3,'2018-12-01T20:34:04Z', 3, 4);
insert into INSTALACAO (id, data_instalacao, id_endereco_cobranca, id_cliente) values (4,'2021-12-01T20:34:04Z', 4, 1);
insert into INSTALACAO (id, data_instalacao, id_endereco_cobranca, id_cliente) values (5,'2015-12-01T20:34:04Z', 5, 1);


---FATURA----

insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (1, '1232', 1, '2021-04-15', '2021-04-04', '21489569', 95.6, 1);
insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (2, '9332', 2, '2021-04-15', '2021-04-03', '15489569', 74.6, 2);
insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (3, '3232', 3, '2021-04-15', '2021-04-02', '21454569', 60.6, 5);
insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (4, '2515', 4, '2021-04-15', '2021-04-01', '21541554', 95.6, 2);
insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (5, '9554', 4, '2021-04-15', '2021-04-03', '56484554', 52.6, 3);
insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (6, '9500', 2, '2021-04-15', '2021-04-02', '27998991', 9.6, 4);
insert into FATURA (id, codigo_fatura, id_cliente, data_vencimento, data_leitura, valor_leitura, valor_conta, id_instalacao) values (7, '5458', 1, '2021-04-15', '2021-04-01', '16549487', 250.0, 1);


