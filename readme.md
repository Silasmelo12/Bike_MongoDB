# readme



>  **_NOTE:_** É necessário ter o Docker instalado.



Pasos

- Baixar a imagem do mongodb no docker. Execute o código: 

  ```
  docker pull tutum/mongodb
  ```

- Criar um container com a imagem do mongodb sem usuario e senha com o nome *bikes*: 

```
docker run -d -p 27017:27017 -p 28017:28017 -e AUTH=no --name bikes tutum/mongodb
```

- Inicializando a base de dados *bikes* 

  ```
  docker start bikes
  ```

- Configuração em yml:

```
spring:
  data:

mongodb:
  authentication-database: admin
  database: bikes
  port: 27017
  host: localhost
```

> **_NOTE:_** Sobre as dependências, o maven e Spring Boot são os responsáveis por fazer o trabalho. Estão no arquivo *pom.xml*