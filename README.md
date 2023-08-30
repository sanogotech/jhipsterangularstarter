# jhipsterangularstarter

## Docs

- https://agency04.com/creating-a-spring-petclinic-app-with-jhipster/
- https://www.jhipster.tech/separating-front-end-and-api/
- https://www.jhipster.tech/jdl/options


## Install

```
npm install -g generator-jhipster
jhipster

```

##  Jhipster Matrice de compatibilité

une matrice de compatibilité générale entre les versions de Java, Node.js et JHipster. Cependant, veuillez noter que les versions peuvent évoluer et que vous devriez toujours vérifier les dernières informations auprès de la documentation officielle de JHipster.

Version JHipster	Version Java recommandée	Version Node.js recommandée

```
7.x.x	Java 11	Node.js 12, 14
6.x.x	Java 8, 11	Node.js 10, 12
5.x.x	Java 8	Node.js 8, 10
4.x.x	Java 8	Node.js 8
3.x.x	Java 8	Node.js 8

```
Assurez-vous de consulter la documentation officielle de JHipster pour obtenir les informations les plus récentes sur les versions recommandées pour votre projet spécifique, car elles peuvent changer en fonction des mises à jour et des évolutions de ces technologies.

So using nvm I switched the node version to v8.12.0 with the below command:
Install several version of Node.
```
> nvm install 8.12.0 // to install the version I wanted

> nvm use 8.12.0  // use the installed version

```

## Generating only a front-end or a back-end application

You can choose to generate only a JHipster back-end or JHipster front-end application. At generation time, this is only a matter of choosing flags which are described in our [application generation documentation]({{ site.url }}/creating-an-app/):

- `jhipster --skip-client` will only generate a back-end application (this is typically what JHipster microservices are)
- `jhipster --skip-server [options]` will only generate a front-end application (e.g. `jhipster --skip-server --db=sql --auth=jwt`)

## Command

```
npm  install
npm  run  start:dev

```

##   Front 

- http://localhost:4200
- http://localhost:4200/admin/docs   :
- http://localhost:4200/swagger-ui/

##  API

- http://localhost:8080/api/*
- http://localhost:8080/v2/api-docs/


```
mvn clean spring-boot:run

```

## JDL

- https://www.jhipster.tech/jdl/options
