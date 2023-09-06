<h1>Projeto de CRUD de Produtos com Angular e Spring Boot</h1>
<h2>Este é um projeto de exemplo que demonstra como criar um aplicativo web de CRUD de produtos usando Angular e Spring Boot, com persistência de dados no PostgreSQL. O aplicativo permite que os usuários realizem as seguintes operações:</h2>
<ul><h3>
<li>Criar um novo produto com nome e preço.</li>
<li>Editar as informações de um produto existente.</li>
<li>Apagar um produto.</li>
<li>Visualizar a lista de produtos cadastrados.</li>
  
<h2>Requisitos para executar este projeto em sua máquina, você precisará ter as seguintes ferramentas instaladas:</h2>
  <li>Java Development Kit (JDK) 8 ou superior. </li>
  <li>Node.js e npm (Node Package Manager). </li>
  <li>Angular CLI. </li>
  <li>PostgreSQL. </li>
  <li>Um IDE Java, como o IntelliJ IDEA ou o Eclipse. </li>
  <li>Um navegador da web moderno. </li>
  <li>Configurar o Banco de Dados </li>

<h2>  Este projeto utiliza o banco de dados PostgreSQL para armazenar os dados dos produtos. Certifique-se de criar um banco de dados PostgreSQL e configurar as informações de conexão no arquivo application.properties do projeto Spring Boot.</h2>
<p>Exemplo de configuração do banco de dados no application.properties:</p>
  <li>spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados </li>
  <li>spring.datasource.username=seu_usuario </li>
  <li>spring.datasource.password=sua_senha </li>
  <li>spring.jpa.hibernate.ddl-auto=update </li>
  <li>Configuração do Back-End (Spring Boot) </li>
  <li>Abra o projeto no seu IDE Java preferido. </li>
  <li>Certifique-se de que o JDK 8 (ou superior) esteja configurado como a versão do projeto. </li>
  <li>Execute a classe principal ProductCrudApplication para iniciar o servidor Spring Boot. </li>
  <li>O servidor será iniciado em http://localhost:8080/products. </li>

<h2>Configuração do Front-End (Angular):</h2>
  <li>Navegue até a pasta frontend no terminal. </li>
  <li>Execute o comando npm install para instalar as dependências do Angular. </li>
  <li>Após a instalação, execute ng serve para iniciar o servidor de desenvolvimento do Angular. </li>
  <li>O aplicativo Angular estará disponível em http://localhost:4200/products. </li>

<h2>Uso:</h2>
  <li>Acesse o aplicativo no navegador em http://localhost:4200/products. Você verá a interface do usuário do CRUD de produtos.</li>
  <li>Para criar um novo produto, clique no botão "Adicionar Produto" e preencha as informações. </li>
  <li>Para editar um produto existente, clique no botão de edição ao lado do produto na lista. </li>
  <li>Para apagar um produto, clique no botão de exclusão ao lado do produto na lista. </li>
  <li>Para visualizar a lista de produtos cadastrados, basta acessar a página principal. </li>
</h3></ul>
