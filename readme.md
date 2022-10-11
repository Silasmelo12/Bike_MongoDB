# readme



Este projeto é um *CRUD* para bicicletas que visa realizar um cadastro de um bicicleta informando os seguintes dados: **_marca_**, **_ano de fabricação_** e a **_cor_** da bicicleta. Estas informações são persistidos em um bando de dados não relacional **mongoDB** sendo executado por um **Container** no **Docker**.

>  **_NOTE:_** É necessário ter o Docker instalado.



1. Baixar a imagem do mongodb no docker.

```
docker pull tutum/mongodb
```

2. Criar um container com a imagem do mongodb sem usuario e senha com o nome *bikes*.

```
docker run -d -p 27017:27017 -p 28017:28017 -e AUTH=no --name bikes tutum/mongodb
```

3. Inicializando a base de dados *bikes*.

```
docker start bikes
```

3. Configuração em yml.

```
spring:
  data:
    mongodb:
      authentication-database: admin
      database: bikes
      port: 27017
      host: localhost
```

> **_NOTE:_** Sobre as dependências, o Maven e Spring Boot são os responsáveis por fazer o trabalho. Estão no arquivo *pom.xml*



Afim consumir esta API, utilizei o **Postman**.

1. Cadastro de um bicicleta
   - Abrir o Postman e selecionar o método HTTP **_POST_**. Em **_Body_**, selecione arquivo em **_JSON_**. E então envie o seguinte exemplo para o link `http://localhost:8080/v1`:

   ```
   {
       "marca": "Caloi",
       "ano": 2017,
       "cor": "Branco"
   }
   ```

   A imagem a seguir ilustra bem o exemplo

   ![This is an image](https://github.com/Silasmelo12/bikeMongoDB/blob/master/imagens/Captura%20de%20tela%202022-10-10%20231755.png)



1. Consultar todas as bicicletas

   - Selecione o método **_GET_** e envie: 

   ```
   http://localhost:8080/v1
   ```

   ​