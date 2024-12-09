ToDo List API

Este projeto é uma API para gerenciar tarefas (CRUD) usando Spring Boot.

Tecnologias Usadas
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL

Práticas Adotadas
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de Respostas de Erro
- Geração Automática do Swagger com a OpenAPI 3\



```markdown

# Como Executar
   git clone https://github.com/lipesc/todo-java.git
   cd todo-java

Configure o MySQL no arquivo `application.properties` criar um database e usuario, senha ou usar o root padrão.

Execute a aplicação:
  
acessível em [http://localhost:8080](http://localhost:8080).

Swagger em [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).
```
# API Endpoints
## Criar Tarefa
```bash
http POST :8080/api/tasks nome="task 1" descricao="testes 1" prioridade=1
```
Resposta:
```json
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

# Listar Tarefas
```bash
http GET :8080/api/tasks
```
Resposta:
```json
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

# Atualizar Tarefa
```bash
http PUT :8080/api/tasks/1 nome="task 1 updated" descricao="testes 1 updated" prioridade=2
```
Resposta:
```json
{
  "descricao": "testes 1 updated",
  "id": 1,
  "nome": "task 1 updated",
  "prioridade": 2,
  "realizado": false
}
```
 # Deletar Tarefa
```bash
http DELETE :8080/api/tasks/1
```
Resposta:
```json
{
  "message": "Tarefa deletada com sucesso"
}
```

[![Java CI](https://github.com/lipesc/todo-java/actions/workflows/main.yml/badge.svg)](https://github.com/lipesc/todo-java/actions/workflows/main.yml)
