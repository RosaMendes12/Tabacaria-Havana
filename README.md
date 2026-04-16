# Tabacaria-Havana

Projeto Tabacaria Senai
Um sistema completo de tabacaria com frontend React e backend Spring Boot, desenvolvido como projeto final do curso Senai.

📋 Descrição

Este projeto consiste em uma aplicação web para uma tabacaria, com funcionalidades de loja online, gerenciamento de produtos e clientes. O frontend permite navegação de produtos, carrinho de compras, favoritos e cadastro de clientes, enquanto o backend fornece APIs REST para gerenciamento de dados.

Nota: Este é um projeto educacional e não promove o consumo de tabaco.

🛠️ Tecnologias Utilizadas

## Frontend

React 19 - Biblioteca JavaScript para interfaces

Vite - Build tool e dev server

Axios - Cliente HTTP para requisições

CSS - Estilização customizada

## Backend

Spring Boot 3.5.13 - Framework Java

Java 17 - Linguagem de 

Spring Data JPA - Persistência de dados

MySQL - Banco de 

Lombok - Redução de código 

Maven - Gerenciamento de 

📋 Pré-requisitos

Node.js (versão 18 ou superior

Java 17 (JDK

MySQL (versão 8.0 ou superior)

Maven (versão 3.6 ou superior)

🚀 Instalação

1. Clone o repositório
  
2. Configuração do Banco de Dados

3.Instale e inicie o MySQL

Crie um banco de dados chamado tabacaria:

Execute o script DDL para criar as tabelas:

4. Configuração do Backend
   
Navegue para a pasta do backend:

Configure as credenciais do banco no application.properties:

Execute o projeto

O backend estará rodando em http://localhost:8080

7. Configuração do Frontend
Em outro terminal, navegue para a pasta do frontend:
Instale as dependências:
Execute o projeto:
O frontend estará rodando em http://localhost:5173

📁 Estrutura do Projeto
✨ Funcionalidades
Frontend (Loja Online)
Navegação de Produtos: Visualização de produtos disponíveis
Carrinho de Compras: Adicionar/remover produtos, calcular total
Sistema de Favoritos: Salvar produtos preferidos
Cadastro de Clientes: Formulário com validação (CPF, telefone, CEP)
Gerenciamento de Clientes: Listar, editar e excluir clientes cadastrados
Interface Responsiva: Design adaptável para diferentes dispositivos
Backend (APIs REST)
Gerenciamento de Produtos: CRUD completo (Criar, Ler, Atualizar, Deletar)
Gerenciamento de Clientes: CRUD completo
Busca por Nome: Filtrar produtos por nome
Validação de Dados: Constraints no banco de dados
CORS Configurado: Permite requisições do frontend
🔗 API Endpoints
Produtos
GET /produtos - Listar todos os produtos
GET /produtos/{id} - Buscar produto por ID
GET /produtos/nome/{nome} - Buscar produtos por nome
POST /produtos - Criar novo produto
PUT /produtos/{id} - Atualizar produto
DELETE /produtos/{id} - Deletar produto
Clientes
GET /clientes - Listar todos os clientes
GET /clientes/{id} - Buscar cliente por ID
POST /clientes - Criar novo cliente
DELETE /clientes/{id} - Deletar cliente
🧪 Testando a Aplicação
Acesse o frontend em http://localhost:5173
Navegue pelos produtos e adicione ao carrinho
Cadastre um cliente usando o formulário
Gerencie produtos através do componente Produtos (se integrado)
Verifique os dados no banco MySQL
🤝 Contribuição
Fork o projeto
Crie uma branch para sua feature (git checkout -b feature/nova-feature)
Commit suas mudanças (git commit -am 'Adiciona nova feature')
Push para a branch (git push origin feature/nova-feature)
Abra um Pull Request
📝 Licença
Este projeto é para fins educacionais e não possui licença específica.

👥 Desenvolvedores
Projeto desenvolvido como trabalho final do curso Senai.

Atenção: Este projeto é puramente educacional e visa demonstrar conceitos de desenvolvimento web full-stack. Não promove nem incentiva o consumo de produtos derivados do tabaco.

Grok Code Fast 1 • 1x
