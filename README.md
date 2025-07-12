# 📦 API de Produtos - Sistema de Gestão de Produtos

Este projeto é um sistema simples para a gestão de produtos, desenvolvido com **Java** utilizando **Spring Boot**. Ele permite o cadastro e a listagem de produtos, armazenando suas informações como nome e preço. O sistema utiliza **H2** como banco de dados em memória para persistência de dados e oferece uma interface web básica construída com **Thymeleaf**. **Lombok** é empregado para minimizar o código boilerplate.

## 🎯 Funcionalidades

  * **Listagem de Produtos:** Visualize todos os produtos cadastrados.
  * **Cadastro de Produtos:** Adicione novos produtos com nome e preço.
  * **Banco de Dados em Memória:** Utiliza o H2 para uma configuração simples e rápida.
  * **Interface Web:** Páginas web básicas para a interação com o sistema de produtos.

## 🚀 Tecnologias Utilizadas

As principais tecnologias utilizadas no desenvolvimento deste projeto incluem:

  * **Java 17**: Linguagem principal do projeto.
  * **Spring Boot**: Framework robusto para o desenvolvimento do backend.
  * **Spring Web**: Componente para construção de aplicações web.
  * **Spring Data JPA**: Simplifica o acesso a dados e a persistência no banco de dados.
  * **H2 Database**: Banco de dados relacional em memória.
  * **Thymeleaf**: Mecanismo de template para renderização da interface web no lado do servidor.
  * **Lombok**: Biblioteca que reduz a necessidade de código repetitivo (getters, setters, construtores).
  * **Maven**: Ferramenta para gerenciamento de dependências e automação de builds.

## 📦 Instalação e Configuração

### 1\. Pré-requisitos

Certifique-se de ter instalado em seu ambiente de desenvolvimento:

  * **Java Development Kit (JDK) 17** ou versão superior.
  * **Maven 3.9.10** ou versão superior (ou utilize o Maven Wrapper incluído no projeto).
  * **Git** para clonar o repositório.

### 2\. Clonando o Repositório

Clone o projeto para sua máquina local usando o comando:

```bash
git clone <https://github.com/AROLima/Produtos_Springboot_thymeleaf>
cd _api_produto
```

### 3\. Rodando o Projeto

Navegue até o diretório raiz do projeto e execute os seguintes comandos para construir e iniciar a aplicação:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

*(No Windows, use `mvnw.cmd` em vez de `./mvnw`)*

A aplicação estará disponível em `http://localhost:8080`.

## 💻 Interface Web

A interface web do sistema permite a listagem e o cadastro de produtos. A aplicação utiliza **Thymeleaf** para renderizar o frontend e **Spring MVC** para o gerenciamento das requisições web.

### Endpoints da Interface Web

  * **Listar Produtos:**

      * URL: `http://localhost:8080/`
      * Método: `GET`
      * Exibe a página `listar.html` com todos os produtos.

  * **Formulário de Cadastro de Produto:**

      * URL: `http://localhost:8080/cadastro`
      * Método: `GET`
      * Exibe o formulário de cadastro na página `cadastrar.html`.

  * **Registrar Produto (Envio):**

      * URL: `http://localhost:8080/cadastro`
      * Método: `POST`
      * Processa os dados do formulário para salvar um novo produto e redireciona para a página de listagem (`/`).

## 🗃️ Banco de Dados H2

Este projeto utiliza o banco de dados H2, que é incorporado e executado em memória. As configurações estão definidas em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:produtodb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

**Nota:** O banco de dados H2 em memória é volátil, o que significa que todos os dados são perdidos quando a aplicação é reiniciada.

## 🤝 Contribuições


## 📄 Licença

Este projeto está licenciado sob a [MIT License](https://www.google.com/search?q=LICENSE).
*(Se você não tiver um arquivo `LICENSE` no seu projeto, considere criar um ou remova es