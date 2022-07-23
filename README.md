<h3 align="center">
  BET's API
</h3>

<div align="center">
    <img src="https://c.tenor.com/GfSX-u7VGM4AAAAC/coding.gif" alt="Gif de uma pessoa programadora" />
</div>
<blockquote align="center">“Não espere para plantar, apenas tenha paciência para colher”!</blockquote>


## :rocket: Sobre a aplicação
A aplicação consiste em criar uma api simples de apostas onde podemos utilizar as operações de [CRUD](https://pt.wikipedia.org/wiki/CRUD) para criação de **apostas** e **apostadores**.

## Tecnologias utilizadas :memo:

- [Java](https://www.java.com/pt-BR/)
- [Spring Framework](https://spring.io/)
- [PostgreSQL](https://www.postgresql.org/)
- [Swagger](https://swagger.io/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## Levantando o banco de dados utilizando docker-compose 🐳

Primeiramente você precisa ter o **docker e o docker compose** instalados em sua máquina para utilizar o banco de dados.

Caso você não possua, siga está **[documentação](https://docs.docker.com/)** para realizar a instalação de ambos. 

## Como utilizar 🤔

Primeiramente clone este repositório.

```
git clone https://github.com/ruanvalente/bets-api
```
Entre na pasta `bets-api` e utilize o maven para instalar as dependências do projeto.

Agora para levantar o banco basta utilizar o docker-compose
```
docker-compose up -d
```
Pronto, sua aplicação estará funcionando ! 🚀



