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
