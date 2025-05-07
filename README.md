# DOCUMENTAÇÃO CP2 - JAVA

Este projeto é um sistema CRUD para gerenciamento de brinquedos, desenvolvido com Spring Boot (Maven) e Java. 

O sistema permite:

- Cadastrar novos brinquedos via POST com JSON

- Consultar brinquedos cadastrados via GET

- Integração com banco de dados Oracle (SQL Developer)

- Testes de endpoints via Postman

## Nome Integrantes
<div align="center">

| Nome | RM |
| ------------- |:-------------:|
| Arthur Eduardo Luna Pulini|554848|
|Lucas Almeida Fernandes de Moraes| 557569     |
|Victor Nascimento Cosme|558856|

</div>



## 🚀 Começando

⚙️ Executando os testes

Os testes foram realizados via postman a seguir vou falar dos testes seguindo o *CRUD* *(Create, Read, Update e Delete)*.

### Create

Para criar ele tem que está no método *POST* e o comando para criar foi: 

```bash
  http://localhost:8080/brinquedos
```

E um corpo para persistência de exemplo: 

```bash
{
    "nome": "Brinquedo 1",
    "tipo": "Tipo 1",
    "classificacao": "Classificacao 1",
    "tamanho": 1,
    "preco": 1
}
```

### Read

Para ler temos duas opções puxar todos e puxar pelo *ID*, lembrando que o método é o *GET*.

Para puxar todos o comando utilizado foi: 

```bash
  http://localhost:8080/brinquedos
```

E um retorno: 

```bash
 [
    {
        "id": 23,
        "nome": "Brinquedo 2",
        "tipo": "Tipo 2",
        "classificacao": "Classificacao 2",
        "tamanho": 2.0,
        "preco": 2.0
    },
    {
        "id": 24,
        "nome": "Brinquedo 1",
        "tipo": "Tipo 1",
        "classificacao": "Classificacao 1",
        "tamanho": 1.0,
        "preco": 1.0
    }
]
```
A segunda opção de retornar pelo *ID*: 

```bash
  http://localhost:8080/brinquedos/{id}
```

Onde está o *{id}* pode colocar qualquer número desde que exista no banco.

Exemplo: 
```bash
  http://localhost:8080/brinquedos/23
```
Possível retorno: 

```bash
  {
    "id": 23,
    "nome": "Brinquedo 2",
    "tipo": "Tipo 2",
    "classificacao": "Classificacao 2",
    "tamanho": 2.0,
    "preco": 2.0
}
```


### Update

Para fazer a atualização ele tem que está no método *PUT*, nele tem que passar pela URL um *ID* que serve para localizar o brinquedo que vai ser modificado e um corpo que vai ser o novo brinquedo, exemplo de chamada: 

Na URL:
```bash
  http://localhost:8080/brinquedos/23
```

No corpo: 
```bash
  {
    "nome": "Brinquedo Atualizado",
    "tipo": "Tipo Atualizado",
    "classificacao": "Classificacao Atualizada",
    "tamanho": 4,
    "preco": 4
}
```

### Delete

Para fazer o *Delete* o método que ele tem que estar é o *DELETE*,  nele tem que passar pela URL um *ID* que serve para localizar o brinquedo que vai ser deletado, exemplo: 

```bash
  http://localhost:8080/brinquedos/23
```

E nele não vai ter resposta, só se ele não achar o brinquedo com esse *ID*.



