# SPRINGBOOT-GARANTAai
# 📄 Projeto - Plataforma de Gestão de Garantias

Bem-vindo(a) ao repositório da **Plataforma de Gestão de Garantias**!  
Este projeto foi desenvolvido com o objetivo de aplicar e consolidar conhecimentos de **desenvolvimento backend** utilizando **Java 21** e **Spring Boot**.

## 🚀 Sobre o Projeto

A Plataforma de Gestão de Garantias tem como propósito gerenciar **clientes** e seus respectivos **bens dados como garantia** para operações financeiras.  
Atualmente, o projeto permite:

- 📋 **Cadastrar clientes**  
- 🔎 **Listar clientes**  
- ✏️ **Atualizar dados de clientes**  
- 🗑️ **Excluir clientes**

Além disso, é possível:

- 🏠 **Cadastrar uma garantia** (automóvel ou imóvel) no nome de um cliente existente.

> **Obs.:** Cada cliente pode possuir **apenas uma** garantia cadastrada.

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Maven**
- **MongoDB** (banco de dados NoSQL)
- **Lombok** (para simplificação de código)
- **Postman** (para testes de API REST)

---

## 📂 Estrutura Atual do Sistema

```bash
src/
 ├── main/
 │   ├── java/
 │   │   └── com.igor.garantias/
 │   │       ├── controller/
 │   │       │    ├── ClienteController.java
 │   │       │    └── GarantiaController.java
 │   │       ├── service/
 │   │       │    ├── ClienteService.java
 │   │       │    └── GarantiaService.java
 │   │       ├── entity/
 │   │       │    ├── Cliente.java
 │   │       │    └── Garantia.java
 │   │       ├── repository/
 │   │       │    ├── ClienteRepository.java
 │   │       │    └── GarantiaRepository.java
 │   │       └── enums/
 │   │            └── TipoGarantia.java
 │   └── resources/
 │        └── application.properties
