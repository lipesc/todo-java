Estudos backend API, esse projeto é para gerenciar tarefas CRUD

## Tecnologias usadas
 
[Spring Boot]\
[Spring MVC]\
[Spring Data JPA]\
[Mysql]\


## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

```
A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para testas os endpoints [httpie]:

- Criar Tarefa 
```
 http POST :8080/api/tasks nome="task 1" descricao="testes 1" prioridade=1

[
  {
    "descricao": "testes 1",
    "id": 1,
    "nome": "task 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Listar Tarefas
```
 http GET :8080/api/tasks

[
  {
    "descricao": "testes 1",
    "id": 1,
    "nome": "task 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Atualizar Tarefa
```
 http PUT :8080/api/tasks/1 nome="task 1 Atualizada" descricao="testes 1 Atualizada" prioridade=2 

[
  {
    "descricao": "testes 1 Atualizada",
    "id": 1,
    "nome": "task 1 Atualizada",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/api/tasks/1

```