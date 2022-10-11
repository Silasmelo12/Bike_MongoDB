# Readme

passos

para baixar a imagem do mongodb para o docker basta executar o código: docker pull tutum/mongodb

para criar um container com a imagem do mongodb sem usuario e senha com o nome "bikes": docker run -d -p 27017:27017 -p 28017:28017 -e AUTH=no --name bikes tutum/mongodb

para start o container: docker start bikes

a configuração no yml é:

spring:
  data:
    mongodb:
      authentication-database: admin
      database: bikes
      port: 27017
      host: localhost
      
e as depencências necessárias estão no arquivo pom.xml e o maven e spring boot toma conta do resto.
