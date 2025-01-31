# API de Música - CRUD de Artistas e Músicas 🎵

Uma API RESTful desenvolvida com Spring Boot para gerenciar artistas e suas músicas, com operações CRUD completas.

## 📌 Funcionalidades

- **CRUD completo para Artistas**
- **CRUD completo para Músicas**
- Relacionamento bidirecional entre Artistas e Músicas
- Banco de dados H2 em memória.


## Imagens
![Image Alt](https://github.com/BrisaTielly/MelodyBase/blob/main/register.png?raw=true)

![Image Alt](https://github.com/BrisaTielly/MelodyBase/blob/main/list.png?raw=true)

![Image Alt](https://github.com/BrisaTielly/MelodyBase/blob/main/details.png?raw=true)


## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- Spring Data JPA
- H2 Database (embutida)
- Lombok
- Maven
- Spring Web

## 📋 Pré-requisitos

- JDK 17 instalado
- Maven
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)
- Postman/Insomnia para testar os endpoints

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/music-api-springboot.git
```

2. Entre no diretório do projeto:
```bash
cd music-api-springboot
```

3. Execute o projeto com Maven:
```bash
mvn spring-boot:run
```

4. A API estará disponível em:  
`http://localhost:8080`


## 🌐 Endpoints Principais

### Artistas (`/api/artistas`)
| Método | Rota               | Descrição                  |
|--------|--------------------|----------------------------|
| GET    | `/artists/list`    | Lista todos os artistas    |
| GET    | `/artists/listar/{id}` | Busca artista por ID       |
| POST   | `/artists/save`    | Cria novo artista          |
| PUT    | `/artists/update/{id}` | Atualiza artista existente |
| DELETE | `/artist/delete/{id}` | Remove artista             |

### Músicas (`/api/musicas`)
| Método | Rota               | Descrição                |
|--------|--------------------|--------------------------|
| GET    | `/songs/list`     | Lista todas as músicas   |
| GET    | `/songs/list/{id}` | Busca música por ID      |
| POST   | `/songs/save`     | Cria nova música         |
| PUT    | `/songsd/update/{id}` | Atualiza música existente|
| DELETE | `/songsd/delete/{id}` | Remove música           |

## 📊 Banco de Dados
- **H2 Console**: `http://localhost:8080/h2-console`
- Configurações padrão:
  - Driver: `org.h2.Driver`
  - JDBC URL: `jdbc:h2:mem:musicdb`
  - User: `sa`
  - Password: (vazio)


```

## Em desenvolvimento...

- Front End com Thymeleaf
- Documentação com Swagger
- Tratamento de exceções personalizados 
- Testes automatizados
- Autenticação com JWT
- 
---
