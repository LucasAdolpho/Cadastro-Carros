1. Sobre o Projeto

Nome do Projeto: CadastroCarros

Resumo:
O CadastroCarros é uma aplicação web desenvolvida para facilitar o gerenciamento de veículos em um sistema simples e intuitivo.
O sistema permite o cadastro, listagem, edição e exclusão de carros, oferecendo uma interface amigável baseada em Thymeleaf.
Seu público-alvo inclui estudantes, oficinas, revendedoras ou qualquer pessoa que precise organizar informações de veículos.
A aplicação segue boas práticas de arquitetura com camadas bem definidas e oferece uma API REST para integração com outros sistemas.

Escopo mínimo implementado:
- CRUD completo da entidade Carro
- Interface Web utilizando Thymeleaf
- API REST funcional
- Estrutura em camadas (controller → service → repository)

2. Tecnologias
Java 17+
Spring Boot (Web, Data JPA, Validation)
Thymeleaf
MySQL 8+
Maven
HTML/CSS/JavaScript (básico)

3. Arquitetura (resumo)
Camadas:
controller/web – Páginas Thymeleaf
controller/api – Endpoints REST
service – Regra de negócio
repository – Acesso ao banco via Spring Data JPA
Banco relacional (MySQL) usando JPA/Hibernate
Templates Thymeleaf para visualização e formulários

4. Requisitos de Ambiente
JDK 17+
Maven 3.8+
MySQL 8+

5. Configuração do Banco
Crie um banco:
CREATE DATABASE cadastro_carros_db;

6. Configuração da Aplicação
Arquivo: src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/projeto_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.security.user.name=admin
spring.security.user.password=123
spring.thymeleaf.enabled=true

7. Instalação e Execução
git clone xxxxxxxxxxxxxxxxxxxxxxxxxxxx
mvn spring-boot:run


Acesse no navegador:

👉 http://localhost:8080

8. Entidade Principal (Carro)

A aplicação implementa CRUD completo da entidade Cadastro (carro), com os seguintes campos:
id
nome
marca
modelo
ano

9. Segurança

Obs.: Este projeto não contém Spring Security por padrão,
mas possui estrutura preparada para inclusão futura caso necessário.

10. Rotas Web
Rota	Função
/	Página inicial
/carro	Listar carros
/carro/novo	Formulário de criação
/carro/editar/{id}	Edição
/carro/excluir/{id}	Exclusão

11. API REST

Base: /api/carros
Endpoints:
GET /api/carros – lista todos
GET /api/carros/{id} – detalhe
POST /api/carros – cria um carro
PUT /api/carros/{id} – atualiza
DELETE /api/carros/{id} – exclui

Exemplo (curl)
curl -X POST http://localhost:8080/api/carros \
  -H "Content-Type: application/json" \
  -d '{"nome":"Up", "marca":"Volkswagen", "modelo":"Take", "ano":2016}'

12. Testes

Executar:
mvn test

13. Checklist de Reprodutibilidade

- [ ] JDK/Maven instalados -
- [ ] Banco criado e application.properties configurado
- [ ] Seeds aplicados (ou runner implementado) -
- [ ] App sobe e rotas públicas/privadas funcionam -
- [ ] CRUD via interface e via API

14. Links de Entrega

GitHub: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

YouTube: [link do vídeo] (Não consegui fazer)

15. Documento PDF (para Classroom)

O pdf deve conter:
Nome do Projeto
Integrantes e RA
Resumo do projeto
Arquitetura
Prints das telas
Links do vídeo e do repositório

16. Critérios de Avaliação

CRUD completo do domínio – 3,0
API REST – 1,0
Frontend Thymeleaf – 1,0
MySQL + JPA – 1,0
Qualidade do código – 1,0
Documentação – 1,0
Vídeo – 0,5
Segurança (caso implementada) – 1,5

17. Autores

Lucas Adolpho Pereira — RA: 3023103948
[Matheus Gouveia Melo] — RA [3025104198]
