# Saci Flow

Saci Flow é uma aplicação Spring Boot projetada para gerenciar usuários. Este projeto faz parte de um trabalho universitário.

## Começando

### Pré-requisitos

- Java 23
- Gradle
- MySQL

### Instalação

1. Clone o repositório:
    ```sh
    git clone https://github.com/BrenoOliveiraSilva/saci_flow.git
    cd saci_flow
    ```

2. Configure o banco de dados em `src/main/resources/application.properties`:
    ```ini
    spring.datasource.url=jdbc:mysql://sql10.freesqldatabase.com:3306/sql10748963
    spring.datasource.username=sql10748963
    spring.datasource.password=seYDCpGnzG
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    ```

3. Construa o projeto:
    ```sh
    ./gradlew build
    ```

4. Execute a aplicação:
    ```sh
    ./gradlew bootRun
    ```

### Endpoints da API

- **Criar Usuário**
    - **URL:** `/users/create`
    - **Método:** `POST`
    - **Corpo da Requisição:**
        ```json
        {
            "username": "string",
            "mail": "string",
            "password": "string"
        }
        ```

- **Buscar Todos os Usuários**
    - **URL:** `/users/getAll`
    - **Método:** `GET`

- **Buscar Usuário por ID**
    - **URL:** `/users/{id}`
    - **Método:** `GET`

- **Buscar Usuário por Nome de Usuário**
    - **URL:** `/users/username/{username}`
    - **Método:** `GET`

- **Buscar Usuário por Email**
    - **URL:** `/users/mail/{mail}`
    - **Método:** `GET`

- **Atualizar Usuário**
    - **URL:** `/users/{id}`
    - **Método:** `PUT`
    - **Corpo da Requisição:**
        ```json
        {
            "username": "string",
            "mail": "string",
            "password": "string"
        }
        ```

- **Deletar Usuário por ID**
    - **URL:** `/users/{id}`
    - **Método:** `DELETE`

- **Deletar Todos os Usuários**
    - **URL:** `/users/deleteAll`
    - **Método:** `DELETE`

### Construído com

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework para construção de aplicações Java
- [Gradle](https://gradle.org/) - Ferramenta de build
- [MySQL](https://www.mysql.com/) - Banco de dados

### Autores

- Breno Oliveira da Silva RA 12723131992
- Bruno Oliveira Melo RA 12723111120
- Felipe Miranda Santana RA 1271716805

### Licença

Este projeto é licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
